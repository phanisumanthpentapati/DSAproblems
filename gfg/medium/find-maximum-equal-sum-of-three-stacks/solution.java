class Solution {
    public int maxEqualSum(ArrayList<Integer> s1, ArrayList<Integer> s2,
                           ArrayList<Integer> s3) {
        // code here
        int st1=0,st2=0,st3=0;
             int [] arr=new int[3];
             for(int i:s1)
               arr[0]+=i;
             for(int i:s2)
             arr[1]+=i;
             for(int i:s3)
              arr[2]+=i;
              int i=0,j=0,k=0;

              PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
              pq.add(new int[]{arr[0],0});
              pq.add(new int[]{arr[1],1});
              pq.add(new int[]{arr[2],2});
            while(i<s1.size() && j<s2.size() && k<s3.size())
            {
                          //    System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);

                if(arr[0]==arr[1] &&arr[1]==arr[2])
                    return arr[0];

                   int [] val=pq.poll();
                //  System.out.println(val[0]+"checck"+ val[1]) ;
                   arr[val[1]]-=(val[1]==0)?s1.get(i++):((val[1]==1)?s2.get(j++):s3.get(k++));
                   val[0]=arr[val[1]];
                   pq.add(val);
            }

            return 0;
    }
}