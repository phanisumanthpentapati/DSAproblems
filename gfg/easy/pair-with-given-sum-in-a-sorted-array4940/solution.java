class Solution {
    public int countPairs(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            }

            else if (sum > target) {
                right--;
            }

            else {

                // Same value on both sides
                if (arr[left] == arr[right]) {

                    int n = right - left + 1;

                    count += n * (n - 1) / 2;

                    break;
                }

                // Count duplicates on left
                int leftValue = arr[left];
                int leftCount = 0;

                while (left <= right && arr[left] == leftValue) {
                    leftCount++;
                    left++;
                }

                // Count duplicates on right
                int rightValue = arr[right];
                int rightCount = 0;

                while (left <= right && arr[right] == rightValue) {
                    rightCount++;
                    right--;
                }

                count += leftCount * rightCount;
            }
        }

        return count;
    }
}