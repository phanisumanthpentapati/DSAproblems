# Number of Closed Islands

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a 2D `grid` consists of `0s` (land) and `1s` (water).  An  *island*  is a maximal 4-directionally connected group of `0s` and a  *closed island*  is an island  **totally**  (all left, top, right, bottom) surrounded by `1s.`

Return the number of  *closed islands*.

 

 **Example 1:** 

```
Input: grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]
Output: 2
Explanation: 
Islands in gray are closed because they are completely surrounded by water (group of 1s).
```

 **Example 2:** 

```
Input: grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]
Output: 1

```

 **Example 3:** 

```
Input: grid = [[1,1,1,1,1,1,1],
               [1,0,0,0,0,0,1],
               [1,0,1,1,1,0,1],
               [1,0,1,0,1,0,1],
               [1,0,1,1,1,0,1],
               [1,0,0,0,0,0,1],
               [1,1,1,1,1,1,1]]
Output: 2

```

 

 **Constraints:** 

- 1 <= grid.length, grid[0].length <= 100
- 0 <= grid[i][j] <=1

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.84%)  
**Memory:** 46 MB (beats 93.65%)  
**Submitted:** 2026-10-25T10:57:42.075Z  

```java
class Solution {
    private int[][] grid;
    private int m, n;

    private boolean closed(int i, int j) {  // flood the island through (i, j); true if it never reaches the border
        if (i < 0 || i >= m || j < 0 || j >= n) return false;  // stepped off the grid: the island touches the border
        if (grid[i][j] == 1) return true;  // water, or land we already flooded
        grid[i][j] = 1;  // visited: turn it into water
        return closed(i + 1, j) & closed(i - 1, j) & closed(i, j + 1) & closed(i, j - 1);  // & (not &&) floods all 4 sides
    }

    public int closedIsland(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 0 && closed(i, j)) count++;
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-closed-islands/)