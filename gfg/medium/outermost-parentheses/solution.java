class Solution {
    public String removeOuter(String s) {
        // code here
        int cnt=0;
            StringBuilder sb=new StringBuilder();
            for(char ch:s.toCharArray()){
                if(ch=='(')
                {
                    cnt++;
                    if(cnt>1){
                        sb.append('(');
                    }
                }else if(ch==')')
                {
                    if(cnt>1){
                        sb.append(')');
                        cnt--;
                    }else{
                        cnt--;
                    }
                }
            }
            return sb.toString();
    }
}