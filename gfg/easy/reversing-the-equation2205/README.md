# Reversing the equation

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a mathematical equation that contains only numbers and +, -, *, /. Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.
It is guaranteed that the given equation is valid, and there are no leading zeros.

 **Example 1:** 

```
Input:
S = "20-3+5*2"
Output: 2*5+3-20
Explanation: The equation is reversed with
numbers remaining the same.

```

 **Example 2:** 

```
Input: 
S = "5+2*56-2/4"
Output: 4/2-56*2+5
Explanation: The equation is reversed with
numbers remaining the same.

```

 **Your Task:** 
You don't need to read input or print anything. Your task is to complete the function  **reverseEqn()** which takes the string S representing the equation as input and returns the resultant string representing the equation in reverse.

 **Expected Time Complexity:** O(|S|).
 **Expected Auxiliary Space:** O(|S|).

 **Constraints:** 
1<=|S|<=105
The string contains only the characters '0' - '9', '+', '-', '*', and '/'.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T16:14:00.093Z  

```java
import java.util.Stack;

class Solution {
    String reverseEqn(String S) {
        Stack<String> stack = new Stack<>();
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                stack.push(num.toString());
                stack.push(String.valueOf(ch));
                num.setLength(0);
            }
        }

        stack.push(num.toString());

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reversing-the-equation2205/1)