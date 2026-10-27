# interleaved-strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T11:28:42.831Z  

```java
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        // code here
        if(s1.length() + s2.length() != s3.length()){
                   return false;
               }
               boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
               dp[0][0] = true;
               for(int i=0;i<=s1.length();i++){
                   for(int j=0;j<=s2.length();j++){

                        if(i>0 && s1.charAt(i-1) == s3.charAt(i+j-1)){
                            dp[i][j] = dp[i][j] || dp[i-1][j];
                        }
                        if(j>0 && s2.charAt(j-1) == s3.charAt(i+j-1)){
                            dp[i][j] = dp[i][j] || dp[i][j-1];
                   }
               }
               }
               return dp[s1.length()][s2.length()];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/interleaved-strings/1)