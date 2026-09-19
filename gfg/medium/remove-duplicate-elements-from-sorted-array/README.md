# remove-duplicate-elements-from-sorted-array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T16:53:31.742Z  

```java
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {

        ArrayList<Integer>res= new ArrayList<>();
             res.add(arr[0]);
             for(int i=1;i<arr.length;i++){
                 if(arr[i]!=arr[i-1]){
                     res.add(arr[i]);
                 }
             }
             return res;
    }

}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1)