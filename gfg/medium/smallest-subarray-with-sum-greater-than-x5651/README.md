# smallest-subarray-with-sum-greater-than-x5651

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T16:55:10.541Z  

```java
class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
      int sum=0;
              int left=0;
              int ans=Integer.MAX_VALUE;

              for(int right=0; right<arr.length;right++){
                  sum+=arr[right];
                  while(sum>x){
                      ans=Math.min(ans,right-left+1);
                      sum-=arr[left];
                      left++;
                  }
              }

              return ans==Integer.MAX_VALUE ? 0: ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1)