class Solution {
    String removeDuplicates(String s) {

        boolean[] seen = new boolean[256];

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!seen[ch]) {
                ans.append(ch);
                seen[ch] = true;
            }
        }

        return ans.toString();
    }
}