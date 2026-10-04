class Sol {
    int[] count(String s) {
        // your code here
        // your code here
             int LowCount=0;
             int UppCount=0;
             int SpeCount=0;
             int NumCount=0;
             for(int i=0;i<s.length();i++){
                 char ch=s.charAt(i);
                 if(Character.isLowerCase(ch)){
                     LowCount++;
                 }
                 else if(Character.isUpperCase(ch)){
                     UppCount++;
                 }
                 else if( Character.isDigit(ch)){
                     NumCount++;
                 }
                 else
                 {
                     SpeCount++;
                 }
             }
             return new int[]{UppCount,LowCount,NumCount,SpeCount};
    }
}