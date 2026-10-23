# two-repeated-elements-1587115621

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T10:37:26.105Z  

```java
import java.util.HashSet;

class Solution {
    public int[] twoRepeated(int[] arr) {
        int[] result = new int[2];
        int j = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                result[j++] = arr[i];
            } else {
                set.add(arr[i]);
            }
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1)