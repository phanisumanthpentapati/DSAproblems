# Integer to English Words

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Convert a non-negative integer `num` to its English words representation.

 

 **Example 1:** 

```
Input: num = 123
Output: "One Hundred Twenty Three"

```

 **Example 2:** 

```
Input: num = 12345
Output: "Twelve Thousand Three Hundred Forty Five"

```

 **Example 3:** 

```
Input: num = 1234567
Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"

```

 

 **Constraints:** 

- 0 <= num <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 62.93%)  
**Memory:** 45.2 MB (beats 34.40%)  
**Submitted:** 2026-10-22T13:50:38.976Z  

```java
class Solution {
    String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
        "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"};

    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        if (num < 20) return ones[num];

        if (num < 100)
            return tens[num / 10] +
                (num % 10 == 0 ? "" : " " + ones[num % 10]);

        if (num < 1000)
            return ones[num / 100] + " Hundred" +
                (num % 100 == 0 ? "" : " " + numberToWords(num % 100));

        if (num < 1000000)
            return numberToWords(num / 1000) + " Thousand" +
                (num % 1000 == 0 ? "" : " " + numberToWords(num % 1000));

        if (num < 1000000000)
            return numberToWords(num / 1000000) + " Million" +
                (num % 1000000 == 0 ? "" : " " + numberToWords(num % 1000000));

        return numberToWords(num / 1000000000) + " Billion" +
            (num % 1000000000 == 0 ? "" : " " + numberToWords(num % 1000000000));
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/integer-to-english-words/)