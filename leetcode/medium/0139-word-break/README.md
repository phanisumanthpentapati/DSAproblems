# Word Break

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` and a dictionary of strings `wordDict`, return `true` if `s` can be segmented into a space-separated sequence of one or more dictionary words.

 **Note**  that the same word in the dictionary may be reused multiple times in the segmentation.

 

 **Example 1:** 

```
Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".

```

 **Example 2:** 

```
Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.

```

 **Example 3:** 

```
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false

```

 

 **Constraints:** 

- 1 <= s.length <= 300
- 1 <= wordDict.length <= 1000
- 1 <= wordDict[i].length <= 20
- s and wordDict[i] consist of only lowercase English letters.
- All the strings of wordDict are unique.

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 25.77%)  
**Memory:** 46.3 MB (beats 21.97%)  
**Submitted:** 2026-10-12T16:00:04.055Z  

```java
import java.util.*;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();

        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        Set<String> set = new HashSet<>(wordDict);

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/word-break/)