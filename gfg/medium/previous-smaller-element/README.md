# previous-smaller-element

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T10:17:43.758Z  

```java
class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
              ArrayList<Integer> smallerOnLeft = new ArrayList<>();
              for(int i=0;i<arr.length;i++){
                  while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                      stack.pop();
                  }
                  smallerOnLeft.add(!stack.isEmpty()?stack.peek():-1);
                  stack.add(i);
              }
              return new ArrayList(smallerOnLeft.stream().map(i->i==-1?-1:arr[i]).toList());
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/previous-smaller-element/1)