# union-of-two-arrays3538

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T10:56:26.273Z  

```java
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        // code here
             TreeSet<Integer> set = new TreeSet<>();
             for(int num : a){
                 set.add(num);
             }
             for(int num : b){
                 set.add(num);
             }
             return new ArrayList<Integer>(set);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1)