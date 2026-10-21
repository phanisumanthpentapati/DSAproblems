

        class Solution {
            static String postToInfix(String s) {

                Stack<String> st = new Stack<>();

                for (int i = 0; i < s.length(); i++) {

                    char ch = s.charAt(i);

                    if (Character.isLetterOrDigit(ch)) {
                        st.push(String.valueOf(ch));
                    } 
                    else {
                        String t1 = st.pop();
                        String t2 = st.pop();

                        String temp = "(" + t2 + ch + t1 + ")";

                        st.push(temp);
                    }
                }

                return st.pop();
            }
        }
