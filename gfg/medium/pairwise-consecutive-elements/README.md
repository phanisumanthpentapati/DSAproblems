# pairwise-consecutive-elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T14:52:08.858Z  

```java
class Solution {
    public boolean pairWiseConsecutive(Stack<Integer> st) {

        if (st.size() % 2 != 0) {
            st.pop();
        }

        while (!st.empty()) {

            int first = st.peek();
            st.pop();

            int second = st.peek();
            st.pop();

            if (first == second + 1 || first == second - 1) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pairwise-consecutive-elements/1)