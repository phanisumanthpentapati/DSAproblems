# Sum Two Large Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings denoting non-negative numbers s1 and s2. Calculate the sum of s1 and s2.

 **Examples:** 

```
Input: s1 = "25", s2 = "23"
Output: "48"
Explanation: The sum of 25 and 23 is 48.
```

```
Input: s1 = "2500", s2 = "23"
Output: "2523"
Explanation: The sum of 2500 and 23 is 2523.
```

```
Input: s1 = "2", s2 = "3"
Output: "5"
Explanation: The sum of 2 and 3 is 5.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T16:57:29.497Z  

```java

class Solution {
    String findSum(String s1, String s2) {
        StringBuilder result = new StringBuilder();

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += s1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += s2.charAt(j) - '0';
                j--;
            }

            result.append(sum % 10);
            carry = sum / 10;
        }

        // Reverse the answer because digits were added
        // from right to left.
        result.reverse();

        // Remove leading zeros, if present.
        int k = 0;
        while (k < result.length() - 1 &&
               result.charAt(k) == '0') {
            k++;
        }

        return result.substring(k);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-numbers-or-number1219/1)