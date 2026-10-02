# reverse-array-using-stack--143151

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T05:22:51.400Z  

```java

class Solution {
    public void reverseArray(int[] arr) {
        // codehere
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        int ind = 0;
        while(!st.isEmpty()){
            int top = st.peek();
            st.pop();
            arr[ind]=top;
            ind++;
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-array-using-stack--143151/1)