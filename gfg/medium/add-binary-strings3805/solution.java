import java.util.Stack;

class Solution {
    public String addBinary(String s1, String s2) {
        Stack<Character> std1 = new Stack<>();
        Stack<Character> std2 = new Stack<>();
        Stack<Character> std = new Stack<>();

        for (int i = 0; i < s1.length(); i++) {
            std1.push(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            std2.push(s2.charAt(i));
        }

        boolean hit = false;

        while (!std1.empty() && !std2.empty()) {
            char a = std1.pop();
            char b = std2.pop();

            if (a == '0' && b == '0') {
                if (!hit) {
                    std.push('0');
                } else {
                    std.push('1');
                    hit = false;
                }
            } else if (a == '0' || b == '0') {
                if (!hit) {
                    std.push('1');
                } else {
                    std.push('0');
                }
            } else {
                if (!hit) {
                    std.push('0');
                    hit = true;
                } else {
                    std.push('1');
                }
            }
        }

        while (!std1.empty()) {
            char a = std1.pop();

            if (a == '0') {
                if (!hit) {
                    std.push('0');
                } else {
                    std.push('1');
                    hit = false;
                }
            } else {
                if (!hit) {
                    std.push('1');
                } else {
                    std.push('0');
                }
            }
        }

        while (!std2.empty()) {
            char a = std2.pop();

            if (a == '0') {
                if (!hit) {
                    std.push('0');
                } else {
                    std.push('1');
                    hit = false;
                }
            } else {
                if (!hit) {
                    std.push('1');
                } else {
                    std.push('0');
                }
            }
        }

        StringBuilder str = new StringBuilder();

        if (hit) {
            std.push('1');
        }

        while (!std.empty()) {
            str.append(std.pop());
        }

        while (str.length() > 1 && str.charAt(0) == '0') {
            str.deleteCharAt(0);
        }

        return str.toString();
    }
}