# sum-all-array-elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T17:04:18.235Z  

```java
class Solution {
    public int arraySum(int arr[]) {
        // code here
        int sum = 0;
              for(int i=0;i<arr.length;i++)
              {
                  sum = arr[i]+sum;
              }
              return sum;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-all-array-elements/1)