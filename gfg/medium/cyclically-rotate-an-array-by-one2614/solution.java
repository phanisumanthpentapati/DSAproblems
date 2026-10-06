  class Solution {
    public void rotate(int[] arr) {
        int [] arrc=Arrays.copyOf(arr,arr.length);

        int temp=arr[arr.length-1];

        for(int i=1;i<arr.length;i++){
            arr[i]=arrc[i-1];
        }

        arr[0]=temp;

        return;

        // code here

    }
}