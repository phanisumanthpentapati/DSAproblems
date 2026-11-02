class Solution {
    static int minimumNumberOfSwaps(String s) {
        int ans = 0;
        int i = 0;
        int curr = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '[') {
                ans += Math.max(curr, 0);
                curr--;
            } else {
                curr++;
            }
            i++;
        }

        return ans;
    }
}