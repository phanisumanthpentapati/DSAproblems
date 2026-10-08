class Solution {
    public long modify(long N) {
        // code here
        String s = Long.toString(N);
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));

        for (int  i=1; i<s.length();i++){
            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));

            }
           }
           return Long.parseLong(result.toString());
    }
}