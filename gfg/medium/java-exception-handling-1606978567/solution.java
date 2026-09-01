class Solution {
    public int findMin(int a, int b) {
        // code here\
      int sum = a + b;
      int diff = a - b;
      int prod = a * b;
      int div = (b == 0) ? 0 : (a / b);

      return Math.min(Math.min(sum, diff), Math.min(prod, div));
    }
}