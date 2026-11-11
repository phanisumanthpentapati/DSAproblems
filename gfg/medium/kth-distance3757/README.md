# kth-distance3757

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T14:06:56.274Z  

```java
class Solution {
    public boolean checkWithinK(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();

                for(int i = 0;i<arr.length;i++) {
                    if(map.containsKey(arr[i])) {
                        if(i-map.get(arr[i]) <= k) {
                            return true;
                        }
                    } 
                    map.put(arr[i],i);
                }
                return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/kth-distance3757/1)