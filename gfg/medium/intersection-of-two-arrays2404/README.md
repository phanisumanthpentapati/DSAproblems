# intersection-of-two-arrays2404

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T17:35:02.053Z  

```java
class Solution {
    public static int intersectSize(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }

        HashSet<Integer> intersection = new HashSet<>();

        for (int num : b) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection.size();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1)