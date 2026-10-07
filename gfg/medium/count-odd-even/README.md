# count-odd-even

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T07:35:32.068Z  

```java
class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int[] ans = new int[2];
        int n=arr.length;
        int even=0,odd=0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 == 0)
            {
               even++;
            }
            else
               odd++;
        }
        ans[0]=odd;
        ans[1]=even;
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-odd-even/1)