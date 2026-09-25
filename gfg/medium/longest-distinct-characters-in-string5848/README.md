# longest-distinct-characters-in-string5848

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T15:52:06.527Z  

```java
class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int left=0;
              int maxLen=0;
              Set<Character>set=new HashSet<>();

              for(int right=0;right<s.length();right++)
              {
                  while(set.contains(s.charAt(right)))
                  {
                    set.remove(s.charAt(left));
                    left++;
                  }
                  set.add(s.charAt(right));
                  maxLen=Math.max(maxLen,right-left+1);
              }
              return maxLen;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1)