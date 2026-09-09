# Largest Subarray of Equal 0's and 1's

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr**  of 0s and 1s. Find and return the length of the longest subarray with equal number of 0s and 1s.

 **Examples:** 

```
Input: arr[] = [1, 0, 1, 1, 1, 0, 0]
Output: 6
Explanation: arr[1...6] is the longest subarray with three 0s and three 1s.
```

```
Input: arr[] = [0, 0, 1, 1, 0]
Output: 4
Explanation: arr[0...3] or arr[1...4] is the longest subarray with two 0s and two 1s.
```

```
Input: arr[] = [0]
Output: 0
Explanation: There is no subarray with an equal number of 0s and 1s.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T13:54:07.783Z  

```java
class Solution {
    public int maxLen(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int max = 0;
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0)
                sum--;
            else
                sum++;


            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
            
                map.put(sum, i);
            }
        }

        return max;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1)