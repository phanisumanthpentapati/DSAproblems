# Sort Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a stack of integers  **st[]**. Sort the stack in ascending order (smallest element at the bottom and largest at the top).

 **Examples:** 

```
Input: st[] = [41, 3, 32, 2, 11]
Output: [41, 32, 11, 3, 2]
Explanation: After sorting, the smallest element (2) is at the bottom and the largest element (41) is at the top.

```

```
Input: st[] = [3, 2, 1]
Output: [3, 2, 1]
Explanation: The stack is already sorted in ascending order.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T06:02:22.132Z  

```java

class Solution {

    public void sortStack(java.util.Stack<Integer> st) {

        // Base condition
        if (st.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = st.pop();

        // Sort the remaining stack
        sortStack(st);

        // Insert the removed element
        insertSorted(st, top);
    }

    private void insertSorted(java.util.Stack<Integer> st, int value) {

        // If stack is empty or top is smaller,
        // insert the element
        if (st.isEmpty() || st.peek() <= value) {
            st.push(value);
            return;
        }

        // Remove the larger element
        int top = st.pop();

        // Insert value in the correct position
        insertSorted(st, value);

        // Restore the removed element
        st.push(top);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-a-stack/1)