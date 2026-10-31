# Shortest Path With At Most K Consecutive Identical Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer `n` representing the number of nodes in a  **directed weighted**  graph, numbered from 0 to `n - 1`. This is represented by a 2D integer array `edges`, where `edges[i] = [ui, vi, wi]` represents a directed edge from node `ui` to node `vi` with weight `wi`.

You are also given a string `labels` of length `n`, where `labels[i]` is the character assigned to node `i`, and an integer `k`.

Return the  **minimum**   **total**  edge weight of a path from node 0 to node `n - 1` such that the concatenation of the labels of the nodes along the path contains  **at most**  `k`  **consecutive**   **identical**  characters. If no valid path exists, return -1.

 

 **Example 1:** 

 **Input:**  n = 3, edges = [[0,1,1],[1,2,1],[0,2,3]], labels = "aab", k = 1

 **Output:**  3

 **Explanation:** 

The optimal valid path from node 0 to node 2 is as follows:

- Use edges[2] = [0, 2, 3] to reach node 2 with a weight wi = 3.
The corresponding concatenation of labels is `"ab"`, which satisfies at most `k = 1` consecutive identical characters. Thus, the answer is 3.

 **Example 2:** 

 **Input:**  n = 3, edges = [[0,1,1],[1,2,1],[0,2,3]], labels = "aab", k = 2

 **Output:**  2

 **Explanation:** 

The optimal valid path from node 0 to node 2 is as follows:

- Use edges[0] = [0, 1, 1] to reach node 1 with weight wi = 1.
- Use edges[1] = [1, 2, 1] to reach node 2 with weight wi = 1.
The corresponding concatenation of labels is `"aab"`, which satisfies at most `k = 2` consecutive identical characters. Thus, the answer is 2.

 **Example 3:** 

 **Input:**  n = 3, edges = [[0,1,1],[1,2,1]], labels = "aaa", k = 2

 **Output:**  -1

 **Explanation:** 

There is no valid path from node 0 to node 2 that satisfies at most `k = 2` consecutive identical characters. Thus, the answer is -1.

 

 **Constraints:** 

- 1 <= n == labels.length <= 5 * 104
- 0 <= edges.length <= 5 * 104
- edges[i] == [ui, vi, wi]
- 0 <= ui, vi <= n - 1
- ui != vi
- 1 <= wi <= 104
- labels consists of lowercase English letters
- 1 <= k <= 50

## Solution

**Language:** Java  
**Runtime:** 48 ms (beats 96.21%)  
**Memory:** 207.9 MB (beats 96.21%)  
**Submitted:** 2026-10-31T09:49:34.263Z  

```java
class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        java.util.List<java.util.List<int[]>> graph =
            new java.util.ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new java.util.ArrayList<>());
        }

        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            int same = labels.charAt(u) == labels.charAt(v) ? 1 : 0;
            graph.get(u).add(new int[]{v, w, same});
        }

        int[] done = new int[n];
        java.util.Arrays.fill(done, k + 1);

        java.util.PriorityQueue<long[]> heap =
            new java.util.PriorityQueue<>((a, b) -> {
                int cmp = Long.compare(a[0], b[0]);
                if (cmp != 0) return cmp;

                cmp = Long.compare(a[1], b[1]);
                if (cmp != 0) return cmp;

                return Long.compare(a[2], b[2]);
            });

        heap.offer(new long[]{0, 0, 1});

        while (!heap.isEmpty()) {
            long[] current = heap.poll();
            long d = current[0];
            int u = (int) current[1];
            int r = (int) current[2];

            if (r >= done[u]) continue;
            done[u] = r;

            if (u == n - 1) return (int) d;

            for (int[] e : graph.get(u)) {
                int v = e[0], w = e[1];
                int nr = e[2] == 1 ? r + 1 : 1;

                if (nr < done[v]) {
                    heap.offer(new long[]{d + w, v, nr});
                }
            }
        }

        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/shortest-path-with-at-most-k-consecutive-identical-characters/)