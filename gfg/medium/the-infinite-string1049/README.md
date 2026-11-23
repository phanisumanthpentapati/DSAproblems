# the-infinite-string1049

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T09:37:53.776Z  

```java
class Solution {
    public char posInfinite(String s, int pos) {
        // code here
        long len = s.length();
               long target = pos;
               long step = 0;

               // Find the expansion step where length >= pos
               while (len < target) {
                   step++;
                   len = 2 * len + step;
               }

               // Trace the position back to the original string
               while (target > s.length()) {

                   long prevLen = (len - step) / 2;

                   // Position is inside the '$' block
                   if (target > prevLen && target <= prevLen + step) {
                       return '$';
                   }

                   // Position is inside the reversed string
                   if (target > prevLen + step) {
                       target = len - target + 1;
                   }

                   len = prevLen;
                   step--;
               }

               return s.charAt((int) target - 1);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-infinite-string1049/1)