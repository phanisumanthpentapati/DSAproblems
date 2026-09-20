class Solution {
    char firstRep(String S) {

        int[] freq = new int[26];

        // Step 1: Count frequency of every character
        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 'a';
            freq[index]++;
        }

        // Step 2: Find the first character whose frequency > 1
        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 'a';

            if (freq[index] > 1) {
                return S.charAt(i);
            }
        }

        return '#';
    }
}