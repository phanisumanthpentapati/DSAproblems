# postfix-to-infix-conversion

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T05:39:09.607Z  

```java


        class Solution {
            static String postToInfix(String s) {

                Stack<String> st = new Stack<>();

                for (int i = 0; i < s.length(); i++) {

                    char ch = s.charAt(i);

                    if (Character.isLetterOrDigit(ch)) {
                        st.push(String.valueOf(ch));
                    } 
                    else {
                        String t1 = st.pop();
                        String t2 = st.pop();

                        String temp = "(" + t2 + ch + t1 + ")";

                        st.push(temp);
                    }
                }

                return st.pop();
            }
        }

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/postfix-to-infix-conversion/1)