# Most Frequent Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s** of lowercase alphabets. The task is to find the maximum occurring character in the string  **s**. If more than one character occurs the maximum number of times then print the lexicographically smaller character.

 **Examples:** 

```
Input: s = "testsample"
Output: 'e'
Explanation: 'e' is the character which is having the highest frequency.
```

```
Input: s = "output"
Output: 't'
Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.
```

 **Constraints:** 
1 ≤ |s| ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T07:13:09.134Z  

```java
import java.util.*;

class Solution {
    public static char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        char maxChar = s.charAt(0);
        int maxCount = hm.get(maxChar);

        // Find maximum frequency
        for (char ch : s.toCharArray()) {
            if (hm.get(ch) > maxCount ||
                (hm.get(ch) == maxCount && ch < maxChar)) {

                maxCount = hm.get(ch);
                maxChar = ch;
            }
        }

        return maxChar;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1)