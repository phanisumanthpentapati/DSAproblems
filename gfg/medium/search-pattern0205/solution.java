class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        // code here
     ArrayList<Integer> res = new ArrayList<>();
            int m = pat.length(), n = txt.length(), i = 0, j = 0, lps[] = new int[m];
            for (int k = 1, len = 0; k < m; ) 
                if (pat.charAt(k) == pat.charAt(len)) lps[k++] = ++len;
                else if (len != 0) len = lps[len - 1]; else lps[k++] = 0;

            while (i < n) {
                if (txt.charAt(i) == pat.charAt(j)) { i++; j++; }
                if (j == m) { res.add(i - j); j = lps[j - 1]; }
                else if (i < n && txt.charAt(i) != pat.charAt(j))
                    if (j != 0) j = lps[j - 1]; else i++;
            }
            return res;   
    }
}