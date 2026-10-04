# string-with-numbers-at-its-end5749

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T12:05:27.958Z  

```java
class Solution {
    int isSame(String s) {

       // code here
            int i = s.length() - 1, num = 0, p = 1;
            while (i >= 0 && Character.isDigit(s.charAt(i))) {
                num = (s.charAt(i--) - '0') * p + num;
                p *= 10;
            }
             return (i + 1 == num) ? 1 : 0;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/string-with-numbers-at-its-end5749/1)