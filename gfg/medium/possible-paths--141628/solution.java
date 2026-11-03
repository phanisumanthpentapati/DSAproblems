import java.util.*;

class Solution {

    static class DSU {
        int[] parent;
        int[] size;

        DSU(int n) {
            parent = new int[n + 1];
            size = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        long union(int u, int v) {
            int rootU = find(u);
            int rootV = find(v);

            if (rootU == rootV) {
                return 0L;
            }

            long newPairs = (long) size[rootU] * size[rootV];

            if (size[rootU] < size[rootV]) {
                int temp = rootU;
                rootU = rootV;
                rootV = temp;
            }

            parent[rootV] = rootU;
            size[rootU] += size[rootV];

            return newPairs;
        }
    }

    public ArrayList<Integer> maximumWeight(int n, int[][] edges, int[] queries) {
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        int q = queries.length;
        int[][] sortedQueries = new int[q][2];

        for (int i = 0; i < q; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }

        Arrays.sort(sortedQueries, (a, b) -> Integer.compare(a[0], b[0]));

        DSU dsu = new DSU(n);
        long[] ans = new long[q];
        long totalPairs = 0;
        int edgeIndex = 0;

        for (int i = 0; i < q; i++) {
            int limit = sortedQueries[i][0];

            while (edgeIndex < edges.length && edges[edgeIndex][2] <= limit) {
                totalPairs += dsu.union(edges[edgeIndex][0], edges[edgeIndex][1]);
                edgeIndex++;
            }

            ans[sortedQueries[i][1]] = totalPairs;
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (long value : ans) {
            result.add((int) value);
        }

        return result;
    }
}