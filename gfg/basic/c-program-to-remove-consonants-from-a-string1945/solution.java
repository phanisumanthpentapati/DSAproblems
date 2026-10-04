class Solution {
    String remConsonants(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||
                 ch == 'E' || ch == 'I' || ch == 'o' || ch == 'u')
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
};