# Shortest Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a string `s`. You can convert `s` to a palindrome by adding characters in front of it.

Return  *the shortest palindrome you can find by performing this transformation*.

 

 **Example 1:** 

```
Input: s = "aacecaaa"
Output: "aaacecaaa"

```

 **Example 2:** 

```
Input: s = "abcd"
Output: "dcbabcd"

```

 

 **Constraints:** 

- 0 <= s.length <= 5 * 104
- s consists of lowercase English letters only.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 98.41%)  
**Memory:** 46.1 MB (beats 97.75%)  
**Submitted:** 2026-10-16T16:17:27.489Z  

```java

class Solution {
   public String shortestPalindrome(String s) {
        StringBuilder res = new StringBuilder();
        int j=0, end = s.length();
        while(true){
            j=0;
            for(int i=end-1;i>=0;i--){
                if(s.charAt(i) == s.charAt(j)) j++;
            }
            if(j==end) break;
            end = j;
        }
        res.append(s.substring(end, s.length())).reverse().append(s.substring(0, end)).append(s.substring(end, s.length()));
        return res.toString();
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/shortest-palindrome/)