class Solution {
    String firstAlphabet(String s) {
        // code here
        StringBuilder sb = new StringBuilder();

              // First word starts at index 0
              sb.append(s.charAt(0));

              // After every space, a new word starts
              for (int i = 1; i < s.length(); i++) {
                  if (s.charAt(i) == ' ') {
                      sb.append(s.charAt(i + 1));
                  }
              }

              return sb.toString();
    }
};