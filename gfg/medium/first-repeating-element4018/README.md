# first-repeating-element4018

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T11:15:18.690Z  

```java
class Solution {
    public int firstRepeated(int[] arr) {
        

       Map<Integer , Integer> map = new HashMap<>();

            for(int i : arr){

                map.put(i , map.getOrDefault(i , 0) + 1);
            }

            for(int i = 0 ; i < arr.length ; i++){

                if(map.get(arr[i]) > 1){

                    return i + 1;
                }
            }
            return -1;   }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1)