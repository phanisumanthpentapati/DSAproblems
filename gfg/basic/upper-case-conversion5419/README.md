# Capitalize First Letter of Words

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, convert the first letter of each word in the string to uppercase. 

 **Examples:** 

```
Input: s = "gEEKs"
Output: "GEEKs"

```

```
Input: s = "i love programming"
Output: "I Love Programming"

```

 **Constraints:** 
1 <= s.length() <= 104
Consists of lowercase alphabets and spaces to separate words

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T11:22:53.023Z  

```java
class Solution {
    public String convert(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        
        boolean firstLetter = true;

        for(char ch:s.toCharArray())
        {
            if(ch == ' ')
            {
                sb.append(ch);
                firstLetter=true;
            }
            else if(firstLetter)
            {
                sb.append(Character.toUpperCase(ch));
                firstLetter = false;
            }
            else 
            {
                sb.append(ch);
            }
              
        }
        return sb.toString();
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/upper-case-conversion5419/1)