# Create Grid With Exactly One Path

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given two integers `m` and `n`, representing the number of rows and columns of a grid.

Construct  **any**  `m x n` grid consisting only of the characters `'.'` and `'#'`, where:

- '.' represents a free cell.
- '#' represents an obstacle cell.

A  **valid path**  is a sequence of free cells that:

- Starts at the top-left cell (0, 0).
- Ends at the bottom-right cell (m - 1, n - 1).
- Moves only: Right, from (i, j) to (i, j + 1), or Down, from (i, j) to (i + 1, j).

Return any grid such that there is  **exactly one valid path**  from the top-left cell to the bottom-right cell.

 

 **Example 1:** 

 **Input:**  m = 2, n = 3

 **Output:**  ["..#","#.."]

 **Explanation:** 

The only valid path is: `(0,0) → (0,1) → (1,1) → (1,2)`

 **Example 2:** 

 **Input:**  m = 3, n = 3

 **Output:**  ["..#","#..","##."]

 **Explanation:** 

The only valid path is: `(0,0) → (0,1) → (1,1) → (1,2) → (2,2)`

 **Example 3:** 

 **Input:**  m = 1, n = 4

 **Output:**  ["...."]

 **Explanation:** 

The only valid path is: `(0,0) → (0,1) → (0,2) → (0,3)`

 

 **Constraints:** 

- 1 <= m, n <= 25

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 56.59%)  
**Memory:** 46 MB (beats 90.70%)  
**Submitted:** 2026-10-27T09:48:55.788Z  

```java
class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        char[] row = new char[n];
        for (int j = 0; j < n; ++j) {
            row[j] = '#';
        }
        for (int i = 0; i < m; ++i) {
            grid[i] = new String(row);
        }
        char[] first = grid[0].toCharArray();
        for (int j = 0; j < n; ++j) {
            first[j] = '.';
        }
        grid[0] = new String(first);
        for (int i = 0; i < m; ++i) {
            char[] r = grid[i].toCharArray();
            r[n - 1] = '.';
            grid[i] = new String(r);
        }
        return grid;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/create-grid-with-exactly-one-path/)