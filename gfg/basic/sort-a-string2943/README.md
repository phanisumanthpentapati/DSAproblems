# Sort String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string consisting of lowercase letters, arrange all its letters in ascending order. 

 **Examples:** 

```
Input: s = "edcab"
Output: "abcde"
Explanation: characters are in ascending order in "abcde".

```

```
Input: s = "xzy"
Output: "xyz"
Explanation: characters are in ascending order in "xyz".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T11:14:27.089Z  

```java
class Solution {
    public String sortString(String s) {
        // code here
        char[] ch=s.toCharArray();
        
        Arrays.sort(ch);
        return new String(ch);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-a-string2943/1)