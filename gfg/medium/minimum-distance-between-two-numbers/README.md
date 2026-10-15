# minimum-distance-between-two-numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T09:09:46.512Z  

```java
class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int n=arr.length,min=n;
                HashMap<Integer,Integer> hm=new HashMap<>();
                for(int i=0;i<n;i++){
                    if(arr[i]==x || arr[i]==y){
                        hm.put(arr[i],i);
                    }
                    if(hm.containsKey(x) && hm.containsKey(y)){
                        min=Math.min(min,Math.abs(hm.get(x)-hm.get(y)));
                    }
                }
                return min==n?-1:min;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1)