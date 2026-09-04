class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        // code here
        Collections.sort(arr, Collections.reverseOrder());
        int sum =0;
        for(int i=0; i<k; i++){
            sum=sum+arr.get(i);
        }
        return sum;
    }
}