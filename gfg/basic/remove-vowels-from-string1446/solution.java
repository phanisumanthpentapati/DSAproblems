class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
              sb.append(ch);
        }
        return sb.toString();
    }
}