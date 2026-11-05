# minimum-days--170646

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T16:55:58.151Z  

```java
class Solution {
    public int getMinimumDays(String s, int[] p) {
        // code here
       int action = 0;

             StringBuilder sb = new StringBuilder(s);
                 if (s.length() <= 1) {
                 return 0;
                }

             for (int i = 0; i < p.length; i++) {

                 int index = p[i];

                 // Last index
                 if (index == p.length - 1) {

                     if (sb.charAt(index - 1) == sb.charAt(index)) {
                         sb.setCharAt(index, '?');
                         action = i + 1;
                     }
                 }

                 // First index
                 else if (index == 0) {

                     if (sb.charAt(index) == sb.charAt(index + 1)) {
                         sb.setCharAt(index, '?');
                         action = i + 1;
                     }
                 }

                 // Middle index
                 else {

                     if (sb.charAt(index) == sb.charAt(index - 1) ||
                         sb.charAt(index) == sb.charAt(index + 1)) {

                         sb.setCharAt(index, '?');
                         action = i + 1;
                     }
                 }

          }

             return action;
          
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-days--170646/1)