# java-exception-handling-1606978567

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T14:44:01.678Z  

```java
class Solution {
    public int findMin(int a, int b) {
        // code here\
      int sum = a + b;
      int diff = a - b;
      int prod = a * b;
      int div = (b == 0) ? 0 : (a / b);

      return Math.min(Math.min(sum, diff), Math.min(prod, div));
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-exception-handling-1606978567/1)