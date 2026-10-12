# Missing in Second Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays  **a[]**  and  **b[]**, find the elements which are present in the first array a[], but not present in the second array b[].

- Return the elements in the same order in which they appear in a[].
- If there are more occurrences of an element in a[] than in b[], then extra occurrences of this element are NOT considered as missing in b[].

 **Examples :** 

```
Input: a[] = [1, 2, 3, 4, 5, 10], b[] = [2, 3, 1, 0, 5]
Output: [4, 10]
Explanation: 4 and 10 are present in first array, but not in second array.
```

```
Input: a[] = [4, 3, 5, 9, 11], b[] = [4, 9, 3, 11, 10]
Output: [5]  
Explanation: Second array does not contain element 5.

```

```
Input: a[] = [9], b[] = [7, 9, 4, 9, 9, 9]
Output: []  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T16:11:05.743Z  

```java
import java.util.*;

class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        // Store all elements of b
        for (int num : b) {
            set.add(num);
        }

        // Check elements of a in their original order
        for (int num : a) {
            if (!set.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/in-first-but-second5423/1)