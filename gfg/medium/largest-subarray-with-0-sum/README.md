# largest-subarray-with-0-sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T13:53:37.035Z  

```java
class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
                int sum = 0;
                int maxLength = 0;
                for(int i = 0;i<arr.length;i++){
                    sum+=arr[i];
                    if(sum == 0){
                        maxLength = Math.max(maxLength, i + 1);
                    }
                    else if(map.containsKey(sum)){
                        maxLength  = Math.max(maxLength, i-map.get(sum));
                    }else{
                        map.put(sum,i);
                    }
                }
                if (map.get(0)!=null && (map.get(0)+1)>maxLength){
                    return map.get(0)+1;
                }
                return maxLength;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1)