class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        int res=0;
               HashMap <Integer,Integer> hm=new HashMap<>();
               for(int i=0;i<arr.length;i++){
                   if(!hm.containsKey(arr[i])){
                       hm.put(arr[i],i);

                   }

                   else{
                       res= Math.max(res, i-hm.get(arr[i]));
                   }


               }
               return res;
    }
}