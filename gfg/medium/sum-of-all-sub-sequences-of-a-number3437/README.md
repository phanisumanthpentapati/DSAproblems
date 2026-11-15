# sum-of-all-sub-sequences-of-a-number3437

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T13:34:44.203Z  

```java
class Solution {
    public int subsequenceSum(String s) {
        // code here
        final int MOD = 1000000007;
                long ds = 0;
                int n = s.length();
                for (char ch : s.toCharArray())
                    ds = (ds + ch - '0') % MOD;
                long df = 1;
                for (int i = 1; i < n; i++)
                    df = (df * 2) % MOD;
                return (int)((ds * df) % MOD);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-all-sub-sequences-of-a-number3437/1)