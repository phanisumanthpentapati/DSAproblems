# reverse-an-array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T17:08:36.913Z  

```java
class Solution {
    public void reverseArray(int arr[]) {
        // code here
      // code here
           int left=0;
           int right=arr.length-1;

           while(left<right){
               int temp=arr[left];
               arr[left]=arr[right];
               arr[right]=temp;
               left++;
               right--;
           }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-an-array/1)