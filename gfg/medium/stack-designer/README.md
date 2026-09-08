# stack-designer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T15:50:47.189Z  

```java
class Solution {

    // Push elements of an array into a stack.
    public static Stack<Integer> push(int arr[]) {
        
        // code here
         Stack<Integer> st=new Stack<>();
                for(int i=0;i<arr.length;i++){
        st.push(arr[i]);
                }
                return st;
    }

    // Print elements of a stack and pop them.
    public static void printAndPop(Stack<Integer> s) {
        // code here
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/stack-designer/1)