# palindrome-string0817

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T13:49:05.205Z  

```java
class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb=new StringBuilder(s);
              sb.reverse();
              String s2=sb.toString();
              if (s.equals(s2)) {
                  return true;
              }

                      else{

                          return false;}
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindrome-string0817/1)