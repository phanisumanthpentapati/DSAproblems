# remove-repeated-digits-in-a-given-number4014

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T15:53:35.125Z  

```java
class Solution {
    public long modify(long N) {
        // code here
        String s = Long.toString(N);
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));

        for (int  i=1; i<s.length();i++){
            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));

            }
           }
           return Long.parseLong(result.toString());
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-repeated-digits-in-a-given-number4014/1)