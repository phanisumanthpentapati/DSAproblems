class Solution {
    public ArrayList<Integer> countVowels(String s, int[][] queries) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

                int n = s.length();
                int[] prefix = new int[n + 1];

                // Build prefix sum array
                for (int i = 0; i < n; i++) {
                    char ch = s.charAt(i);

                    prefix[i + 1] = prefix[i];

                    if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                        prefix[i + 1]++;
                    }
                }

                // Answer each query
                for (int[] query : queries) {
                    int l = query[0];
                    int r = query[1];

                    result.add(prefix[r + 1] - prefix[l]);
                }

                return result;
    }
}