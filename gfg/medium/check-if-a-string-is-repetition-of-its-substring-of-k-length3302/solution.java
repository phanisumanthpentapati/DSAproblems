
import java.util.*;

class Solution {
    public boolean kSubstr(String s, int k) {

        // code here
            HashMap<String , Integer> cnt = new HashMap<>();
            for (int i = 0 ; i < s.length() ; i += k) {
                String str = s.substring(i , Math.min(i + k , s.length()));
                cnt.put(str, cnt.getOrDefault(str , 0) + 1);
            }

            if (cnt.size() == 1) {
                return true;
            }

            if (cnt.size() > 2) {
                return false;
            }

            boolean check = false;
            for (Map.Entry<String, Integer> it : cnt.entrySet()) {
                // System.out.println(it.getKey() + " -> " + it.getValue());
                if (it.getValue() == 1){
                    check = true ;
                }
            }

            return check ? true : false;
    }
}
