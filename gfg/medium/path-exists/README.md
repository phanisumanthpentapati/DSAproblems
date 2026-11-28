# path-exists

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T12:19:31.236Z  

```java
class Solution {
    public boolean checkPath(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // code here
        Queue<Integer> q = new LinkedList<>();

                q.add(u);

                boolean[] vis  = new boolean[adj.size()];
                vis[u] = true;

                while(!q.isEmpty()){
                    Integer node = q.poll();
                    for(Integer nei:adj.get(node)){
                        if(!vis[nei]){
                            vis[nei] = true;
                            q.add(nei);
                            if(nei == v) return true;
                        }
                    }
                }
            return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/path-exists/1)