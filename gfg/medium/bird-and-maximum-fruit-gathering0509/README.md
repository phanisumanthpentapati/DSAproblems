# bird-and-maximum-fruit-gathering0509

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T10:10:10.319Z  

```java

class Solution {
    public int maxPackages(int[] arr, int totalTime) {
        int start = 0;
        int currSum = 0;
        int ans = 0;
        int n = arr.length;

        if (totalTime >= n) {
            for (int value : arr) {
                ans += value;
            }
            return ans;
        }

        for (int end = 0; end < n; end++) {
            currSum += arr[end];

            if (end - start + 1 == totalTime) {
                ans = Math.max(ans, currSum);
                currSum -= arr[start];
                start++;
            }
        }

        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/bird-and-maximum-fruit-gathering0509/1)