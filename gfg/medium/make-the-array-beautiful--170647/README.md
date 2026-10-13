# make-the-array-beautiful--170647

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T11:13:07.081Z  

```java
import java.util.*;

class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        ArrayList<Integer> stack = new ArrayList<>();

               for (int x : arr) {
                   if (!stack.isEmpty() && 
                      ((stack.get(stack.size() - 1) < 0 && x >= 0) || 
                       (stack.get(stack.size() - 1) >= 0 && x < 0))) {

                       stack.remove(stack.size() - 1); // remove opposite sign pair
                   } else {
                       stack.add(x);
                   }
               }

               return stack;
}
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/make-the-array-beautiful--170647/1)