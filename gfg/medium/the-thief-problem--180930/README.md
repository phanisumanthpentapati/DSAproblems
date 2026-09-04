# the-thief-problem--180930

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T12:42:04.135Z  

```java
class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        // code here
        Collections.sort(arr, Collections.reverseOrder());
        int sum =0;
        for(int i=0; i<k; i++){
            sum=sum+arr.get(i);
        }
        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-thief-problem--180930/1)