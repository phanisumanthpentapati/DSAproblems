# array-traversal-reverse

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T16:29:20.419Z  

```java
class Solution {
    public static void arrayTraversalReverse(int[] arr, int n) {
        // Code here
      int left = 0;
      int right = n - 1;
      while (left < right) {
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          left++;
          right--;
      }
      for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
      }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/array-traversal-reverse/1)