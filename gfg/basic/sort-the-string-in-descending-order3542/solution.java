class Solution {
    public String reverseSort(String s) {
        // code here
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
        }
         return sb.toString();
    }
}