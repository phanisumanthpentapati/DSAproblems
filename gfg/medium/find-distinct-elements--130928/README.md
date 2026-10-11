# find-distinct-elements--130928

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T10:51:53.568Z  

```java
class Solution {
    public int countDistinct(int arr[]) {
        // code here
     HashSet<Integer> set=new HashSet<>();
             for(int ele : arr) set.add(ele);
             return set.size();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-distinct-elements--130928/1)