class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        for (int i = 1; i <= n / 2; i++) {

            // First number cannot have leading zeros
            if (num.charAt(0) == '0' && i > 1) {
                break;
            }

            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {

                // Second number cannot have leading zeros
                if (num.charAt(i) == '0' && j > 1) {
                    break;
                }

                String first = num.substring(0, i);
                String second = num.substring(i, i + j);

                if (check(num, i + j, first, second)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean check(String num, int start,
                          String first, String second) {

        while (start < num.length()) {

            // Add the previous two numbers
            String sum = add(first, second);

            // The remaining string must start with their sum
            if (!num.startsWith(sum, start)) {
                return false;
            }

            start += sum.length();

            // Move to the next pair
            first = second;
            second = sum;
        }

        return true;
    }

    private String add(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result.append(sum % 10);
            carry = sum / 10;
        }

        return result.reverse().toString();
    }
}