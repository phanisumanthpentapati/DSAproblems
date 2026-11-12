class Solution {
    public int minDiff(Node root, int k) {

        if (root == null)
            return Integer.MAX_VALUE;

        int value = Integer.MAX_VALUE;

        if (root.data < k)
            value = minDiff(root.right, k);
        else
            value = minDiff(root.left, k);

        return Math.min(Math.abs(root.data - k), value);
    }
}