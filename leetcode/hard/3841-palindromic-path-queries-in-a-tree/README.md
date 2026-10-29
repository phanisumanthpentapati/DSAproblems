# Palindromic Path Queries in a Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an undirected tree with `n` nodes labeled 0 to `n - 1`. This is represented by a 2D array `edges` of length `n - 1`, where `edges[i] = [ui, vi]` indicates an undirected edge between nodes `ui` and `vi`.

You are also given a string `s` of length `n` consisting of lowercase English letters, where `s[i]` represents the character assigned to node `i`.

You are also given a string array `queries`, where each `queries[i]` is either:

- "update ui c": Change the character at node ui to c. Formally, update s[ui] = c.
- "query ui vi": Determine whether the string formed by the characters on the unique path from ui to vi (inclusive) can be rearranged into a palindrome.

Return a boolean array `answer`, where `answer[j]` is `true` if the `jth` query of type `"query ui vi"​​​​​​​` can be rearranged into a  **palindrome**, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  n = 3, edges = [[0,1],[1,2]], s = "aac", queries = ["query 0 2","update 1 b","query 0 2"]

 **Output:**  [true,false]

 **Explanation:** 

- "query 0 2": Path 0 → 1 → 2 gives "aac", which can be rearranged to form "aca", a palindrome. Thus, answer[0] = true.
- "update 1 b": Update node 1 to 'b', now s = "abc".
- "query 0 2": Path characters are "abc", which cannot be rearranged to form a palindrome. Thus, answer[1] = false.

Thus, `answer = [true, false]`.

 **Example 2:** 

 **Input:**  n = 4, edges = [[0,1],[0,2],[0,3]], s = "abca", queries = ["query 1 2","update 0 b","query 2 3","update 3 a","query 1 3"]

 **Output:**  [false,false,true]

 **Explanation:** 

- "query 1 2": Path 1 → 0 → 2 gives "bac", which cannot be rearranged to form a palindrome. Thus, answer[0] = false.
- "update 0 b": Update node 0 to 'b', now s = "bbca".
- "query 2 3": Path 2 → 0 → 3 gives "cba", which cannot be rearranged to form a palindrome. Thus, answer[1] = false.
- "update 3 a": Update node 3 to 'a', s = "bbca".
- "query 1 3": Path 1 → 0 → 3 gives "bba", which can be rearranged to form "bab", a palindrome. Thus, answer[2] = true.

Thus, `answer = [false, false, true]`.

 

 **Constraints:** 

- 1 <= n == s.length <= 5 * 104
- edges.length == n - 1
- edges[i] = [ui, vi]
- 0 <= ui, vi <= n - 1
- s consists of lowercase English letters.
- The input is generated such that edges represents a valid tree.
- 1 <= queries.length <= 5 * 104​​​​​​​queries[i] = "update ui c" or queries[i] = "query ui vi" 0 <= ui, vi <= n - 1 c is a lowercase English letter.

## Solution

**Language:** Java  
**Runtime:** 209 ms (beats 9.52%)  
**Memory:** 242.7 MB (beats 9.52%)  
**Submitted:** 2026-10-29T07:48:04.165Z  

```java
class Solution {
    class sol{
        List<List<Integer>> adj;
        int[] tin,tout,dep,val,bit;
        int [][] par;
        int tim,n,lg;


        void dfs(int u,int p,int d)
        {
            tim += 1;
            tin[u] = tim;
            dep[u] = d;
            par[u][0] = p;

            int i =0 ;
            while(i<adj.get(u).size())
                {
                    int v = adj.get(u).get(i);
                    if(v!=p)
                    {
                        dfs(v,u,d+1);
                        
                    }
                    i+=1;
                }

            tout[u] =tim;
        }

        void upd(int i,int x)
        {
            while(i<=n)
                {
                    bit[i] ^= x;
                    i += i & -i;
                }
            
        }

        void rng(int  l,int r,int x)
        {
            upd(l,x);
            upd(r+1,x);
        }

        int qry(int i)
        {
            int s = 0;
            while (i > 0)
                {
                    s ^= bit[i];
                    i -= i & -i;
                }

            return s;
        }
    }

    int lca(sol o ,int a,int b)
    {
        if(o.dep[a] < o.dep[b])
        {
            int t=  a;
            a = b;
            b = t;
            
        }

        int j = o.lg - 1;
        while ( j >= 0)
            {

                if(o.par[a][j] != -1){
                if(o.dep[o.par[a][j]] >= o.dep[b])
                {
                    a = o.par[a][j];
                   
                }
                }
                j -= 1;
            }
        
    


    if(a == b)
    {
       return a; 
    }


j = o.lg - 1;

while (j >= 0 )
    {
        if(o.par[a][j] != o.par[b][j])
        {
            a = o.par[a][j];
            b = o.par[b][j];
        }
        j -= 1;
    }

return o.par[a][0];
}




    public List<Boolean> palindromePath(int n, int[][] ed, String s, String[] qr) {
        sol o = new sol();
        o.n = n;
        o.lg = 17;
        o.tim = 0;
        o.adj = new ArrayList<>();
        int  i =0 ;
        while (i<n)
            {
                o.adj.add(new ArrayList<>());
                i+=1;
            }

        i = 0;
        while (i< ed.length)
            {
                int  u = ed[i][0];
                int v  = ed[i][1];
                o.adj.get(u).add(v);
                o.adj.get(v).add(u);
                i+=1;
            }

        o.tin = new int[n];
        o.tout = new int[n];
        o.dep = new int[n];
        o.val = new int[n];
        o.bit = new int[n+1];
        o.par = new int[n][o.lg];

        i = 0;
        while (i<n)
            {
                o.val[i] = 1 << (s.charAt(i) - 'a');
                int j =0 ;
                while (j<o.lg)
                    {
                        o.par[i][j] = -1;
                        j += 1;
                    }

                i += 1;
            }

        o.dfs(0,-1,0);



        int j = 1;

        while (j < o.lg)
            {
                i = 0;
                while ( i < n)
                    {
                        if(o.par[i][j-1] != -1)
                        {
                            o.par[i][j] = o.par[o.par[i][j-1]][j-1];
                        }
                        else
                        {
                            o.par[i][j] = -1;
                        }

                        i += 1;
                    }
                j += 1;
            }



        i = 0;
        while(i<n)
            {
                o.rng(o.tin[i],o.tout[i],o.val[i]);
                i+= 1;
            }



        List<Boolean> ans = new ArrayList<>();

        i = 0;

        while (i<qr.length)
            {
                String[] pr = qr[i].split(" ");
                if(pr[0].equals("update"))
                {
                    int u = Integer.parseInt(pr[1]);
                    char c = pr[2].charAt(0);

                    int nm = 1 << (c - 'a');
                    int om = o.val[u];


                    if(nm != om)
                    {
                        int df = nm ^ om;

                        o.rng(o.tin[u],o.tout[u],df);
                        o.val[u] = nm;
                    }
                }

                else

                {
                    int  u = Integer.parseInt(pr[1]);
                    int v = Integer.parseInt(pr[2]);


                    int mu = o.qry(o.tin[u]);
                    int mv = o.qry(o.tin[v]);
                    int lc = lca(o,u,v);


                    int mk = mu ^ mv ^ o.val[lc];


                    if(Integer.bitCount(mk) <= 1)
                    {
                        ans.add(true);
                    }
                    else
                    {
                        ans.add(false);
                    }
                }

                i += 1;
            }


        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindromic-path-queries-in-a-tree/)