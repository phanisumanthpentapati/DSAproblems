# Non-Repeating Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Find the first non-repeating element in a given array **arr**  of integers and if there is not present any non-repeating element then return  **0** 

 **Note:**  The array consists of only positive and negative integers and  **not zero**.

 **Examples:** 

```
Input: arr[] = [-1, 2, -1, 3, 2]
Output: 3
Explanation: -1 and 2 are repeating whereas 3 is the only number occuring once. Hence, the output is 3. 
```

```
Input: arr[] = [1, 1, 1]
Output: 0
Explanation: There is not present any non-repeating element so answer should be 0.
```

 **Constraints:** 
1 <= arr.size <= 106
-109 <= arr[i] <= 109
arr[i] != 0

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T16:02:53.376Z  

```java
import java.util.*;

class Solution {
    public int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Step 1: Count the frequency of each element
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the first element that appears once
        for (int num : arr) {
            if (hm.get(num) == 1) {
                return num;
            }
        }

        return 0;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1)