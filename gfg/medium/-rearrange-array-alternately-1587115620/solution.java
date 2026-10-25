
import java.util.Arrays;

class Solution {
    public void rearrange(int arr[]) {
        Arrays.sort(arr);

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        int[] result = new int[n];
        int k = 0;

        while (left <= right) {
            result[k++] = arr[right--];

            if (left <= right) {
                result[k++] = arr[left++];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
}
