class Solution {
    public ArrayList<Integer> gfSeries(int n) {
        // code here
         ArrayList<Integer> ans = new ArrayList<>();
                if(n>=1) ans.add(0);//t1
                if(n>=2) ans.add( 1);//t2
                geek(3, n,ans);
                return ans;
            }
            public void geek(int curr, int n, ArrayList<Integer> ans){

                if(curr > n)return;

        // Tn = (Tn-2)^2 - Tn-1
        // Since ArrayList is 0-indexed:
        // Tn-2 is at currentIndex - 3
        // Tn-1 is at currentIndex - 2

               int tn1 = ans.get(curr -3);
                int tn2 = ans.get(curr - 2);

                int tn = (tn1 * tn1) - tn2;
                ans.add(tn);

                geek(curr+1, n, ans);
    }
}