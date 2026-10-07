# swap-kth-elements5500

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T07:40:14.106Z  

```java

class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
         Collections.swap(arr, k-1, arr.size()-k);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/swap-kth-elements5500/1)