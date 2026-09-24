import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;

        if (s.length() < totalLength) {
            return result;
        }

        // Frequency of words we need
        Map<String, Integer> required = new HashMap<>();

        for (String word : words) {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }

        // Try each possible starting offset
        for (int start = 0; start < wordLength; start++) {

            int left = start;
            int right = start;
            int count = 0;

            Map<String, Integer> current = new HashMap<>();

            while (right + wordLength <= s.length()) {

                // Get next word from s
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                // Word is not required
                if (!required.containsKey(word)) {
                    current.clear();
                    count = 0;
                    left = right;
                    continue;
                }

                // Add word to current window
                current.put(word, current.getOrDefault(word, 0) + 1);
                count++;

                // Too many occurrences of this word
                while (current.get(word) > required.get(word)) {

                    String leftWord = s.substring(left, left + wordLength);

                    current.put(
                        leftWord,
                        current.get(leftWord) - 1
                    );

                    left += wordLength;
                    count--;
                }

                // We have all words
                if (count == wordCount) {
                    result.add(left);

                    // Move window forward to search for next answer
                    String leftWord = s.substring(left, left + wordLength);

                    current.put(
                        leftWord,
                        current.get(leftWord) - 1
                    );

                    left += wordLength;
                    count--;
                }
            }
        }

        return result;
    }
}