# largest-sum-cycle--170645

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T05:19:02.136Z  

```java
class Solution {
    public int largestSumCycle(int[] edge) {
        // code here
        int n = edge.length;
               int[] state = new int[n];
               long best = -1;

               for (int start = 0; start < n; start++) {
                   if (state[start] != 0)
                       continue;

                   int node = start;
                   while (node != -1 && state[node] == 0) {
                       state[node] = 1;
                       node = edge[node];
                   }

                   if (node != -1 && state[node] == 1) {
                       long sum = 0;
                       int cur = node;
                       do {
                           sum += cur;
                           cur = edge[cur];
                       } while (cur != node);
                       if (sum > best)
                           best = sum;
                   }

                   node = start;
                   while (node != -1 && state[node] == 1) {
                       state[node] = 2;
                       node = edge[node];
                   }
               }
               return (int) best;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/largest-sum-cycle--170645/1)