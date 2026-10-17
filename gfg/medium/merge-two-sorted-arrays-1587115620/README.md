# merge-two-sorted-arrays-1587115620

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T16:45:26.691Z  

```java
class Solution {
    public void mergeArrays(int a[], int b[]) {

       int n = a.length;
             int m = b.length;

             int left = n-1;
             int right = 0;

             while(left>=0 && right<m){

                 if(a[left]>b[right]){

                     //swap

                     int temp = a[left];
                     a[left] = b[right];
                     b[right]=temp;

                     left--;
                     right++;

                 }else{
                     break;
                 }
             }
             Arrays.sort(a);
             Arrays.sort(b);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1)