class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int n=arr.length,min=n;
                HashMap<Integer,Integer> hm=new HashMap<>();
                for(int i=0;i<n;i++){
                    if(arr[i]==x || arr[i]==y){
                        hm.put(arr[i],i);
                    }
                    if(hm.containsKey(x) && hm.containsKey(y)){
                        min=Math.min(min,Math.abs(hm.get(x)-hm.get(y)));
                    }
                }
                return min==n?-1:min;
    }
}