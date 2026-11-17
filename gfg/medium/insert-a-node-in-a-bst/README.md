# insert-a-node-in-a-bst

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T07:36:24.688Z  

```java
class Solution {
    public Node insert(Node root, int key) {

        if(root == null) {
            return new Node(key);
        }

        if(key < root.data) {
            root.left = insert(root.left, key);
        }
        else if(key > root.data) {
            root.right = insert(root.right, key);
        }

        return root;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1)