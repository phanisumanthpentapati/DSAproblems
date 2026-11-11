# Reverse a Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a stack  **st[].**  You have to reverse the stack.

 **Note:** The input array represents the stack from bottom to top (last element is the top). The output is displayed by printing elements from top to bottom after reversal.

 **Examples:** 

```
Input: st[] = [1, 2, 3, 4]
Output: [1, 2, 3, 4]
Explanation: After reversing, the elements of stack are in opposite order.

```

```
Input: st[] = [3, 2, 1]
Output: [3, 2, 1]
Explanation: After reversing, the elements of stack are in opposite order.

```

 **Constraints:** 
1 ≤ st.size() ≤ 100
0 ≤ stack element ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T14:04:41.608Z  

```java
class Solution {

    public static void reverseStack(Stack<Integer> st) {

        if (st.isEmpty()) {
            return;
        }

        int x = st.pop();

        reverseStack(st);

        insert(st, x);
    }

    static void insert(Stack<Integer> st, int x) {

        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int y = st.pop();

        insert(st, x);

        st.push(y);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-stack/1)