# min-number-of-flips3210

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T10:30:02.199Z  

```java
class Solution {
    public int minFlips(String s) {
        // code here
        int count1=0,count2=0;
        for (int i = 0; i < s.length(); i++) {
            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';

            if (s.charAt(i) != expected1) {
                count1++;
            }

            if (s.charAt(i) != expected2) {
                count2++;
            }
        }

        return Math.min(count1, count2);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/min-number-of-flips3210/1)