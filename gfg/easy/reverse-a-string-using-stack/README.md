# Reverse Using Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string **s**, the task is to reverse the string using stack.

 **Examples:** 

```
Input: s ="GeeksforGeeks"
Output:  skeeGrofskeeG

```

```
Input: s ="Geek"
Output: keeG
```

 **Constraints:** 
1 ≤ s.length() ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T11:06:20.485Z  

```java
import java.util.*;

class Solution {
    public String reverse(String S) {
        Stack<Character> st = new Stack<>();

        for (char c : S.toCharArray()) {
            st.push(c);
        }

        StringBuilder result = new StringBuilder();

        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1)