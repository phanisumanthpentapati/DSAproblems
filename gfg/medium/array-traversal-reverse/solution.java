class Solution {
    public static void arrayTraversalReverse(int[] arr, int n) {
        // Code here
      int left = 0;
      int right = n - 1;
      while (left < right) {
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          left++;
          right--;
      }
      for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
      }
    }
}
