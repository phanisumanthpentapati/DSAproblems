# Additive Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

An  **additive number**  is a string whose digits can form an  **additive sequence**.

A valid  **additive sequence**  should contain  **at least**  three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.

Given a string containing only digits, return `true` if it is an  **additive number**  or `false` otherwise.

 **Note:**  Numbers in the additive sequence  **cannot**  have leading zeros, so sequence `1, 2, 03` or `1, 02, 3` is invalid.

 

 **Example 1:** 

```
Input: "112358"
Output: true
Explanation: 
The digits can form an additive sequence: 1, 1, 2, 3, 5, 8. 
1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8

```

 **Example 2:** 

```
Input: "199100199"
Output: true
Explanation: 
The additive sequence is: 1, 99, 100, 199. 
1 + 99 = 100, 99 + 100 = 199

```

 

 **Constraints:** 

- 1 <= num.length <= 35
- num consists only of digits.

 

 **Follow up:**  How would you handle overflow for very large input integers?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 90.94%)  
**Memory:** 42.4 MB (beats 98.11%)  
**Submitted:** 2026-10-17T16:25:32.446Z  

```java
class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        for (int i = 1; i <= n / 2; i++) {

            // First number cannot have leading zeros
            if (num.charAt(0) == '0' && i > 1) {
                break;
            }

            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {

                // Second number cannot have leading zeros
                if (num.charAt(i) == '0' && j > 1) {
                    break;
                }

                String first = num.substring(0, i);
                String second = num.substring(i, i + j);

                if (check(num, i + j, first, second)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean check(String num, int start,
                          String first, String second) {

        while (start < num.length()) {

            // Add the previous two numbers
            String sum = add(first, second);

            // The remaining string must start with their sum
            if (!num.startsWith(sum, start)) {
                return false;
            }

            start += sum.length();

            // Move to the next pair
            first = second;
            second = sum;
        }

        return true;
    }

    private String add(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result.append(sum % 10);
            carry = sum / 10;
        }

        return result.reverse().toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/additive-number/)