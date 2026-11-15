# immediate-smaller-element1142

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T13:33:27.702Z  

```java
class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n = arr.length;
               Stack<Integer> st = new Stack<>();
                ArrayList<Integer> res = new  ArrayList<>();
                for(int i=n-1;i>=0;i--) {
                     while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
                     if(st.isEmpty()) res.add(-1);
                     else res.add(st.peek());
                   st.push(arr[i]);
                }
               Collections.reverse(res);
           return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/immediate-smaller-element1142/1)