# Binary Tree Paths

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the `root` of a binary tree.

Return all  **root-to-leaf**  paths in  **any order**.

A  **leaf**  is a node with no children.

 

 **Example 1:** 

```
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

```

 **Example 2:** 

```
Input: root = [1]
Output: ["1"]

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 100].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 72.60%)  
**Memory:** 43.4 MB (beats 98.15%)  
**Submitted:** 2026-10-23T10:33:50.424Z  

```java
import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        findPaths(root, "", result);
        return result;
    }

    private void findPaths(TreeNode root, String path, List<String> result) {
        if (root == null) {
            return;
        }

        if (path.isEmpty()) {
            path = String.valueOf(root.val);
        } else {
            path += "->" + root.val;
        }

        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }

        findPaths(root.left, path, result);
        findPaths(root.right, path, result);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-paths/)