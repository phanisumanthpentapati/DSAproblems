# Check for Triplet With 0 Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of integers, find if it contains a triplet whose sum equals zero.

 **Examples:** 

```
Input: arr[] = [0, -1, 2, -3, 1]
Output: true
Explanation: The triplet [0, -1, 1] has a sum equal to zero.
```

```
Input: arr[] = [1, 2, 3]
Output: false
Explanation: No triplet with a sum of zero exists.
```

```
Input: arr[] = [-5, 3, 2, -1, 0, 1]
Output: true
Explanation: The triplet [-5, 3, 2] has a sum equal to zero.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T14:43:35.386Z  

```java
class Solution {
    public boolean findTriplets(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1)