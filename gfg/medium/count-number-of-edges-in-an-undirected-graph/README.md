# count-number-of-edges-in-an-undirected-graph

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T10:59:30.320Z  

```java
class Solution {
    public int countEdges(ArrayList<ArrayList<Integer>> adj) {
        // code here
        // code here
               int count=0;
               for(int j=0;j<adj.size();j++)
               {
                   for(int i:adj.get(j))
                   {
                       if(j<i)
                           count++;
                   }
               }
               return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-number-of-edges-in-an-undirected-graph/1)