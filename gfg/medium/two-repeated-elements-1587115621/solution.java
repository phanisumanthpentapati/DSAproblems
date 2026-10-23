import java.util.HashSet;

class Solution {
    public int[] twoRepeated(int[] arr) {
        int[] result = new int[2];
        int j = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                result[j++] = arr[i];
            } else {
                set.add(arr[i]);
            }
        }

        return result;
    }
}