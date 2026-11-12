# remaining-string3515

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T16:12:19.415Z  

```java
class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        // code here
              int r = 0; 
              for(int i = 0 ; i < s.length() ; i++){
                  if(s.charAt(i) == ch){

                  r++;
                  }
                  if(r == count){
                      return s.substring(i+1);
                  }

                  }
                  return"" ;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remaining-string3515/1)