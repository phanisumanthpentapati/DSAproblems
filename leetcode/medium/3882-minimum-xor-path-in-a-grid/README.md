# Minimum XOR Path in a Grid

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a 2D integer array `grid` of size `m * n`.

You start at the  **top-left**  cell `(0, 0)` and want to reach the  **bottom-right**  cell `(m - 1, n - 1)`.

At each step, you  **may**  move either  **right or down**.

The  **cost**  of a path is defined as the  **bitwise XOR**  of all the values in the cells along that path,  **including**  the start and end cells.

Return the  **minimum**  possible XOR value among all valid paths from `(0, 0)` to `(m - 1, n - 1)`.

 

 **Example 1:** 

 **Input:**  grid = [[1,2],[3,4]]

 **Output:**  6

 **Explanation:** 

There are two valid paths:

- (0, 0) → (0, 1) → (1, 1) with XOR: 1 XOR 2 XOR 4 = 7
- (0, 0) → (1, 0) → (1, 1) with XOR: 1 XOR 3 XOR 4 = 6

The minimum XOR value among all valid paths is 6.

 **Example 2:** 

 **Input:**  grid = [[6,7],[5,8]]

 **Output:**  9

 **Explanation:** 

There are two valid paths:

- (0, 0) → (0, 1) → (1, 1) with XOR: 6 XOR 7 XOR 8 = 9
- (0, 0) → (1, 0) → (1, 1) with XOR: 6 XOR 5 XOR 8 = 11

The minimum XOR value among all valid paths is 9.

 **Example 3:** 

 **Input:**  grid = [[2,7,5]]

 **Output:**  0

 **Explanation:** 

There is only one valid path:

- (0, 0) → (0, 1) → (0, 2) with XOR: 2 XOR 7 XOR 5 = 0

The XOR value of this path is 0, which is the minimum possible.

 

 **Constraints:** 

- 1 <= m == grid.length <= 1000
- 1 <= n == grid[i].length <= 1000
- m * n <= 1000
- 0 <= grid[i][j] <= 1023​

## Solution

**Language:** Java  
**Runtime:** 415 ms (beats 8.62%)  
**Memory:** 95.1 MB (beats 20.69%)  
**Submitted:** 2026-10-28T16:06:55.974Z  

```java
class Solution {
    class Pair{
        int row;
        int col;
        int val;
        Pair(int row,int col,int val){
            this.row=row;
            this.col=col;
            this.val=val;
        }
    }
    public int minCost(int[][] grid) {
        int n=grid.length,m=grid[0].length,min=Integer.MAX_VALUE;
        Queue<Pair>queue=new LinkedList<>();
        queue.offer(new Pair(0,0,grid[0][0]));
        boolean[][][]visited=new boolean[n][m][1024];
        visited[0][0][grid[0][0]]=false;
        for(boolean[][]row1:visited){
            for(boolean[]row:row1){
                Arrays.fill(row,false);
            }
        }
        int[]allowedRow={0,1};
        int[]allowedCol={1,0};
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            if(cur.row==n-1&&cur.col==m-1){
                if(cur.val<min)min=cur.val;
                visited[cur.row][cur.col][cur.val]=false;
                continue;
            }
            for(int i=0;i<2;i++){
                int newRow=allowedRow[i]+cur.row;
                int newCol=allowedCol[i]+cur.col;
                if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m&&!visited[newRow][newCol][cur.val^grid[newRow][newCol]]){
                    queue.offer(new Pair(newRow,newCol, cur.val^grid[newRow][newCol]));
                    visited[newRow][newCol][grid[newRow][newCol]^cur.val]=true;
                }
            }
        }
        return min;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-xor-path-in-a-grid/)