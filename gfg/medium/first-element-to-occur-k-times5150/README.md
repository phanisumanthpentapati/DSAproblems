# first-element-to-occur-k-times5150

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T17:11:19.901Z  

```java
class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // code here
     HashMap<Integer,Integer> map = new HashMap<>();
            for(int ele:arr){
                if (map.containsKey(ele)){
                    int freq = map.get(ele);
                    map.put(ele,freq+1);
                }
                else map.put(ele,1);
               if(map.get(ele)==k){
                   return ele;
               }
            }
            return -1;   
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1)