class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
                int sum = 0;
                int maxLength = 0;
                for(int i = 0;i<arr.length;i++){
                    sum+=arr[i];
                    if(sum == 0){
                        maxLength = Math.max(maxLength, i + 1);
                    }
                    else if(map.containsKey(sum)){
                        maxLength  = Math.max(maxLength, i-map.get(sum));
                    }else{
                        map.put(sum,i);
                    }
                }
                if (map.get(0)!=null && (map.get(0)+1)>maxLength){
                    return map.get(0)+1;
                }
                return maxLength;
    }
}