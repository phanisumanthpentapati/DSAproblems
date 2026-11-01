
class Solution {
    public String compressString(String s) {
        s = s.toLowerCase();

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            int count = 0;

            while (i < s.length() && s.charAt(i) == ch) {
                count++;
                i++;
            }

            result.append(ch).append(count);
        }

        return result.toString();
    }
}
