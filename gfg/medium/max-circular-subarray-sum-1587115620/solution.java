class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int totalSum = 0;
               int currMax = 0, globalMax = Integer.MIN_VALUE;
               int currMin = 0, globalMin = Integer.MAX_VALUE;

               for (int x : arr) {
                   totalSum += x;

                   // Standard Kadane's for Max Subarray
                   currMax = Math.max(x, currMax + x);
                   globalMax = Math.max(globalMax, currMax);

                   // Standard Kadane's for Min Subarray
                   currMin = Math.min(x, currMin + x);
                   globalMin = Math.min(globalMin, currMin);
               }

               // If all numbers are negative, globalMax is the answer
               if (globalMax < 0) {
                   return globalMax;
               }

               // Return the best of non-circular and circular paths
               return Math.max(globalMax, totalSum - globalMin);
    }
}
