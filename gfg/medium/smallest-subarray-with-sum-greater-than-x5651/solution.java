class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
      int sum=0;
              int left=0;
              int ans=Integer.MAX_VALUE;

              for(int right=0; right<arr.length;right++){
                  sum+=arr[right];
                  while(sum>x){
                      ans=Math.min(ans,right-left+1);
                      sum-=arr[left];
                      left++;
                  }
              }

              return ans==Integer.MAX_VALUE ? 0: ans;
    }
}
