# cyclically-rotate-an-array-by-one2614

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T17:03:28.695Z  

```java
  class Solution {
    public void rotate(int[] arr) {
        int [] arrc=Arrays.copyOf(arr,arr.length);

        int temp=arr[arr.length-1];

        for(int i=1;i<arr.length;i++){
            arr[i]=arrc[i-1];
        }

        arr[0]=temp;

        return;

        // code here

    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1)