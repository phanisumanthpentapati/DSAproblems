class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        // code here
              int r = 0; 
              for(int i = 0 ; i < s.length() ; i++){
                  if(s.charAt(i) == ch){

                  r++;
                  }
                  if(r == count){
                      return s.substring(i+1);
                  }

                  }
                  return"" ;
    }
}