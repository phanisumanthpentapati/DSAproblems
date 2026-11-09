# count-the-characters1821

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T15:45:31.515Z  

```java
class Solution {
    int getCount(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();

              int i = 0, n = s.length();

              while (i < n) {
                  char ch = s.charAt(i);
                  map.put(ch, map.getOrDefault(ch, 0) + 1);

                  int j = i + 1;
                  while (j < n && s.charAt(j) == ch) {
                      j++;
                  }
                  i = j;
              }

              int count = 0;
              for (int freq : map.values()) {
                  if (freq == k) count++;
              }

              return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-the-characters1821/1)