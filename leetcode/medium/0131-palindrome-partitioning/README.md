# Palindrome Partitioning

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, partition `s` such that every substring of the partition is a  **palindrome**. Return  *all possible palindrome partitioning of* `s`.

 

 **Example 1:** 

```
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]

```

 **Example 2:** 

```
Input: s = "a"
Output: [["a"]]

```

 

 **Constraints:** 

- 1 <= s.length <= 16
- s contains only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 96.28%)  
**Memory:** 65.2 MB (beats 74.64%)  
**Submitted:** 2026-10-15T07:24:17.061Z  

```java
import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> current = new ArrayList<>();

        backtrack(s, 0, current, ans);

        return ans;
    }

    void backtrack(String s, int start,
                   List<String> current,
                   List<List<String>> ans) {

        if (start == s.length()) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            String sub = s.substring(start, end + 1);

            if (isPalindrome(sub)) {
                current.add(sub);

                backtrack(s, end + 1, current, ans);

                current.remove(current.size() - 1);
            }
        }
    }

    boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-partitioning/)