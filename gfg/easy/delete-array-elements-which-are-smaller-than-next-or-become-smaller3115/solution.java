import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> deleteElement(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : arr) {
            list.add(x);
        }

        while (k > 0) {
            boolean deleted = false;

            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i + 1)) {
                    list.remove(i);
                    k--;
                    deleted = true;
                    break;
                }
            }

            if (!deleted) {
                break;
            }
        }

        return list;
    }
}