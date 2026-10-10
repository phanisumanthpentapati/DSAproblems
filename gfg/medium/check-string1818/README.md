# check-string1818

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T16:40:09.255Z  

```java
class Solution {
    Boolean allCharactersSame(String s) {
        // code here
        for (int i = 0; i < s.length(); i++) {
                   if (s.charAt(i) != s.charAt(0)) {
                       return false;   // found a character different from the first
                   }
               }
               return true;            // all ch
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-string1818/1)