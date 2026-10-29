# string-manipulation3706

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T07:50:36.178Z  

```java
class Solution {
    public int removeConsecutiveSame(String[] arr) {
        // code here
        Stack<String> s = new Stack<>();
               for(int i = 0; i < arr.length; i++){
                   if(s.isEmpty()){
                       s.push(arr[i]);
                   }
                   else if(s.peek().equals(arr[i])){
                       s.pop();
                   }
                   else{
                       s.push(arr[i]);
                   }
               }
               return s.size();
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/string-manipulation3706/1)