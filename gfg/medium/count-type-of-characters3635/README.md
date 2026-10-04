# count-type-of-characters3635

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T12:07:26.519Z  

```java
class Sol {
    int[] count(String s) {
        // your code here
        // your code here
             int LowCount=0;
             int UppCount=0;
             int SpeCount=0;
             int NumCount=0;
             for(int i=0;i<s.length();i++){
                 char ch=s.charAt(i);
                 if(Character.isLowerCase(ch)){
                     LowCount++;
                 }
                 else if(Character.isUpperCase(ch)){
                     UppCount++;
                 }
                 else if( Character.isDigit(ch)){
                     NumCount++;
                 }
                 else
                 {
                     SpeCount++;
                 }
             }
             return new int[]{UppCount,LowCount,NumCount,SpeCount};
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-type-of-characters3635/1)