# Repeated Pattern Check

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  made of two characters of  **'x'** and  **'y'**.  The task is to verify whether  **s**  is made by concatenating substrings that follow the pattern  **xnyn**   (equal number of y' *s*  follow equal number of x' *s)*. 

 **Examples:** 

```
Input: s = "xxyyxy" 
Output: true
Explanation: The string can be split into "xxyy" + "xy". Both substrings contain an equal number of consecutive 'x' and 'y' characters.
```

```
Input: s = "xyx"
Output: false
Explanation: The last 'x' cannot form a valid substring because it is not followed by a matching 'y'. 
```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T07:37:36.775Z  

```cpp
class Solution {
  public:
    bool findPattern(string& s) {
        // code here
        int temp=0;

                for(int i=0;i<s.length();i++)
                {
                    if(s[i]=='x')
                    {
                        temp++;
                    }
                    else if(s[i]=='y')
                    {
                        temp--;
                    }

                    if(temp==-1)
                    {
                        return 0;
                    }
                }

                return temp==0;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-pattern-matcher/1)