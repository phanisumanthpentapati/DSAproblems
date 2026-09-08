class Solution {
    public int numSquares(int n) {

        int[] dp = new int[n + 1];

        // Maximum possible answer is n
        // because 1 + 1 + ... + 1 = n
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j * j <= i; j++) {

                int square = j * j;

                dp[i] = Math.min(dp[i], dp[i - square] + 1);
            }
        }

        return dp[n];
    }
}