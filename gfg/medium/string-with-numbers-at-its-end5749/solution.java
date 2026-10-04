class Solution {
    int isSame(String s) {

       // code here
            int i = s.length() - 1, num = 0, p = 1;
            while (i >= 0 && Character.isDigit(s.charAt(i))) {
                num = (s.charAt(i--) - '0') * p + num;
                p *= 10;
            }
             return (i + 1 == num) ? 1 : 0;
    }
}