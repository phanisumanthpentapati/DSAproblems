# find-the-closest-element-in-bst

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T16:15:15.627Z  

```java
class Solution {
    public int minDiff(Node root, int k) {

        if (root == null)
            return Integer.MAX_VALUE;

        int value = Integer.MAX_VALUE;

        if (root.data < k)
            value = minDiff(root.right, k);
        else
            value = minDiff(root.left, k);

        return Math.min(Math.abs(root.data - k), value);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-closest-element-in-bst/1)