# Count Subarrays with Equal Occurrences of Two

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an array  **arr[]** and two integers say,  **x** and  **y**, find the number of subarrays in which the number of occurrences of  **x**  is equal to the number of occurrences of  **y**.

 **Examples:** 

```
Input: arr[] = [1, 2, 1], x = 1, y = 2
Output: 2
Explanation: The possible subarrays have same equal number of occurrences of x and y are:
1) [1, 2], x and y have same occurrence(1).
2) [2, 1], x and y have same occurrence(1).

```

```
Input: arr[] = [1, 2, 1], x = 4, y = 6
Output: 6
Explanation: The possible subarrays have same equal number of occurrences of x and y are:
1) [1], x and y have same occurrence(0).
2) [2], x and y have same occurrence(0).
3) [1], x and y have same occurrence(0).
4) [1, 2], x and y have same occurrence(0).
5) [2, 1], x and y have same occurrence(0).
6) [1, 2, 1], x and y have same occurrence(0).

```

```
Input: arr[] = [1, 2, 1], x = 1, y = 4
Output: 1
Explanation: The possible subarray have same equal number of occurrences of x and y is: [2], x and y have same occurrence(0)
```

 **Constraints:** 
1 <= arr.size() <= 106
1 <= arr[i], x, y<=106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:12:04.365Z  

```java
import java.util.*;

class Solution {

    public int sameOccurrence(int[] arr, int x, int y) {

        int n = arr.length;

        // If x and y are the same,
        // every subarray is valid
        if (x == y) {
            return n * (n + 1) / 2;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int ans = 0;

        map.put(0, 1);

        for (int num : arr) {

            if (num == x) {
                sum++;
            }
            else if (num == y) {
                sum--;
            }

            if (map.containsKey(sum)) {
                ans += map.get(sum);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sub-arrays-with-equal-number-of-occurences3901/1)