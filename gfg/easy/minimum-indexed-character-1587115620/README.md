# Minimum Indexed Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1**  and  **s2** containing lowercase English letters, return the  **smallest**  index of a character in s1 that is also present in s2. If no common character exists between the two strings, return -1.

 **Examples :** 

```
Input: s1 = "geeksforgeeks", s2 = "set"
Output: 1
Explanation: The character 'e' is present in both s1 and s2. Its first occurrence in s1 is at index 1, which is the minimum such index.

```

```
Input: s1 = "geeks", s2 = "hop"
Output: -1
Explanation: There is no character that is common to both s1 and s2. Hence, the answer is -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T16:08:33.262Z  

```java
import java.util.*;

class Solution {
    public int minIndexChar(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();

        // Store all characters of s2
        for (int j = 0; j < s2.length(); j++) {
            set.add(s2.charAt(j));
        }

        // Search s1 from left to right
        for (int i = 0; i < s1.length(); i++) {
            if (set.contains(s1.charAt(i))) {
                return i;
            }
        }

        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1)