class Solution {

    static int countWays(int n) {
        // add your code here
        int[] dp = new int[n+1];
                dp[n] = 1;
                int[] jumps = {1,2,3};
                for(int i=n-1; i>=0; i--) {
                    for(int j=0; j<3; j++) {
                        int jump = jumps[j];

                        if(jump + i < dp.length) {
                            dp[i] += dp[i + jump];
                        }
                    }
                }
                return dp[0];
    }
}
