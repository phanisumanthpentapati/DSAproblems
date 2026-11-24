# outermost-parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T10:42:53.791Z  

```java
class Solution {
    public String removeOuter(String s) {
        // code here
        int cnt=0;
            StringBuilder sb=new StringBuilder();
            for(char ch:s.toCharArray()){
                if(ch=='(')
                {
                    cnt++;
                    if(cnt>1){
                        sb.append('(');
                    }
                }else if(ch==')')
                {
                    if(cnt>1){
                        sb.append(')');
                        cnt--;
                    }else{
                        cnt--;
                    }
                }
            }
            return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/outermost-parentheses/1)