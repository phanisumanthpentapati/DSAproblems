# print-bracket-number4058

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T17:01:17.706Z  

```java
class Solution {
    ArrayList<Integer> bracketNumbers(String s) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int num = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                num++;
                st.push(num);
                ans.add(num);
            } else if (ch == ')') {
                ans.add(st.peek());
                st.pop();
            }
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-bracket-number4058/1)