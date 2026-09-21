# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given `n` pairs of parentheses, write a function to  *generate all combinations of well-formed parentheses*.

 

 **Example 1:** 

```
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

```

 **Example 2:** 

```
Input: n = 1
Output: ["()"]

```

 

 **Constraints:** 

- 1 <= n <= 8

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 69.49%)  
**Memory:** 44.8 MB (beats 44.04%)  
**Submitted:** 2026-09-21T13:22:27.336Z  

```java
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        backtrack(result, "", 0, 0, n);

        return result;
    }

    private void backtrack(List<String> result, String current,
                            int open, int close, int n) {

        // We used all n pairs
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // We can add '(' if we still have opening brackets available
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // We can add ')' only if it won't make the string invalid
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/generate-parentheses/)