# check-if-strings-are-rotations-of-each-other-or-not-1587115620

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T16:55:08.577Z  

```cpp
class Solution {
  public:
    bool areRotations(string &s1, string &s2) {
        // code here
  // code here
         if(s1.length()  != s2.length()) return false;

         return ((s1+s1).find(s2) != string::npos );
     }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1)