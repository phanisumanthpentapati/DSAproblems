# sum-of-products5049

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T11:45:04.337Z  

```java
class Solution {
    public long pairAndSum(int[] arr) {

        long sum = 0;
        int n = arr.length;

        for (int bit = 0; bit < 32; bit++) {

            long count = 0;

            for (int i = 0; i < n; i++) {
                if ((arr[i] & (1 << bit)) != 0) {
                    count++;
                }
            }

            long pairs = count * (count - 1) / 2;

            sum += pairs * (1L << bit);
        }

        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-products5049/1)