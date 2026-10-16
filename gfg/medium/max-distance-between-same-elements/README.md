# max-distance-between-same-elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T16:29:17.362Z  

```java
class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        int res=0;
               HashMap <Integer,Integer> hm=new HashMap<>();
               for(int i=0;i<arr.length;i++){
                   if(!hm.containsKey(arr[i])){
                       hm.put(arr[i],i);

                   }

                   else{
                       res= Math.max(res, i-hm.get(arr[i]));
                   }


               }
               return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/max-distance-between-same-elements/1)