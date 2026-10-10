# Good or Bad String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string s composed of lowercase alphabets and the wildcard character '?', where '?' can be replaced by any lowercase alphabet, classify the string as "BAD" if it is possible to replace every '?' with some lowercase letter such that the resulting string contains more than 3 consonants together or more than 5 vowels together. Otherwise, the string is classified as "GOOD".

Return true if the string is GOOD, and false if the string is BAD.

 **Examples:** 

```
Input: s = "aeioup??"
Output: true
Explanation: No matter how the '?' characters are replaced, the string can never contain more than 3 consonants together or more than 5 vowels together, so it is GOOD.
```

```
Input: s = "bcd?"
Output: false
Explanation: Replacing '?' with any consonant (for example, "bcdb") creates 4 consonants together, exceeding the limit of 3. Since such a replacement exists, the string is BAD.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T16:47:04.845Z  

```java
class Solution {
    boolean isGoodOrBad(String s) {
        // code here
    int vowels = 0, consonants = 0;

           for (int i = 0; i < s.length(); i++) {
               char ch = s.charAt(i);

               if (ch == '?') {
                   vowels++;
                   consonants++;
               }
               else if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                   vowels++;
                   consonants = 0;
               }
               else {
                   consonants++;
                   vowels = 0;
               }

               if (vowels > 5 || consonants > 3) {
                   return false;
               }
           }

           return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/good-or-bad-string1417/1)