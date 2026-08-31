# number-of-occurrence2259

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T09:52:14.294Z  

```java
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length,count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == target)
            {
                count++;
            }
            
        }
        return count;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1)