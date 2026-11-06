
class Solution {
    static final int MOD = 1_000_000_007;

    public int countBT(int h) {

        if (h == 0 || h == 1) {
            return 1;
        }

        long prev2 = 1; // dp[0]
        long prev1 = 1; // dp[1]

        for (int i = 2; i <= h; i++) {

            long curr = (prev1 * prev1
                       + 2L * prev1 * prev2) % MOD;

            prev2 = prev1;
            prev1 = curr;
        }

        return (int) prev1;
    }
}
