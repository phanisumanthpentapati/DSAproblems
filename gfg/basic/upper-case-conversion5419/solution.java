class Solution {
    public String convert(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        
        boolean firstLetter = true;

        for(char ch:s.toCharArray())
        {
            if(ch == ' ')
            {
                sb.append(ch);
                firstLetter=true;
            }
            else if(firstLetter)
            {
                sb.append(Character.toUpperCase(ch));
                firstLetter = false;
            }
            else 
            {
                sb.append(ch);
            }
              
        }
        return sb.toString();
    }
};