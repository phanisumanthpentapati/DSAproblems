# Sort String in Descending Order

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s** containing only lowercase alphabets, the task is to sort it in lexicographically descending order.

 **Examples:** 

```
Input: s = "geeks"
Output: "skgee"
Explanation: It's the lexicographically descending order.

```

```
Input: s = "for"
Output: "rof"
Explanation: "rof" is in lexicographically-descending order.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T12:25:06.559Z  

```java
class Solution {
    public String reverseSort(String s) {
        // code here
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
        }
         return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-the-string-in-descending-order3542/1)