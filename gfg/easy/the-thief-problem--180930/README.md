# Sum of K Largest

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array  **arr[]**. The elements of array represent the value of items. You are also given an integer  **k**. Now, a thief wants to commit a burglary but he can only pick  **k**  items from the given items. Help him so that he gets the maximum total value out of this theft.

 **Examples:** 

```
Input: arr[] = [3, 7, 2, 5, 12, 30], k = 3
Output: 49
Explanation: Here k = 3. The thief should pick 30, 12 and 7.
```

```
Input: arr[] = [8, 10, 2, 50, 80, 20], k = 4
Output: 160
Explanation: Here k = 4. The thief should pick 80, 50, 20 and 10.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T12:43:35.443Z  

```java
class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        // code here
        Collections.sort(arr, Collections.reverseOrder());
        int sum =0;
        for(int i=0; i<k; i++){
            sum=sum+arr.get(i);
        }
        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-thief-problem--180930/1)