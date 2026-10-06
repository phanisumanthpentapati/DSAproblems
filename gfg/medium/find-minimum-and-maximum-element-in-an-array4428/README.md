# find-minimum-and-maximum-element-in-an-array4428

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T16:58:19.737Z  

```java
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
       ArrayList<Integer>res = new ArrayList<>();
             int min=arr[0];
             int max=arr[0];
             for(int i=1; i<arr.length;i++){
                 if(arr[i]>max){
                     max=arr[i];
                 }
                 if(arr[i]<min){
                     min=arr[i];
                 }
             }
             res.add(min);
             res.add(max);
             return res;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1)