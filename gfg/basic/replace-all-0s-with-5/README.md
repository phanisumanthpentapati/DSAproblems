# Replace all 0's with 5

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an integer  **n**. You need to convert all zeroes of  **n**  to 5.

 **Examples:** 

```
Input: n = 1004
Output: 1554
Explanation: There are two zeroes in 1004 on replacing all zeroes with 5, the new number will be 1554.

```

```
Input: n = 121
Output: 121
Explanation: Since there are no zeroes in 121, the number remains as 121.
```

 **Constraints:** 
0 <= n <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T07:30:20.257Z  

```java
class Solution {
    public int convertFive(int n) {

        if (n == 0) {
            return 5;
        }

        int result = 0;
        int place = 1;

        while (n > 0) {

            int digit = n % 10;

            if (digit == 0) {
                digit = 5;
            }

            result = result + digit * place;

            place = place * 10;
            n = n / 10;
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1)