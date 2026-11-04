# XOR of All Subarray XORs

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **arr[]**, find the XOR of the XOR values of all possible non-empty subarrays of the array.

 **Examples:** 

```
Input: arr[] = [1, 2, 3] 
Output: 2
Explanation:
xor[1] = 1
xor[1, 2] = 3
xor[2, 3] = 1
xor[1, 2, 3] = 0
xor[2] = 2
xor[3] = 3
Result: 1 ^ 3 ^ 1 ^ 0 ^ 2 ^ 3 = 2

```

```
Input: arr[] = [1, 2]
Output: 0
Explanation:
xor[1] = 1
xor[1, 2] = 3
xor[2] = 2
Result: 1 ^ 3 ^ 2 = 0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T06:07:48.304Z  

```java
class Solution {
    public int subarrayXor(int[] arr) {
        // code here
     int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 1 && (n - i) % 2 == 1) {
                ans ^= arr[i];
            }
        }

        return ans;
    

    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/game-of-xor1541/1)