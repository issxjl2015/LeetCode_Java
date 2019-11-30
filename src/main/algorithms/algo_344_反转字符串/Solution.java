package main.algorithms.algo_344_反转字符串;

public class Solution {
    public void reverseString(char[] s) {
        if (s.length == 0) {
            return;
        }
        int len = s.length;
        for(int i = 0; i <= (len - 1) / 2; i++) {
            char c = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = c;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(ch);
        System.out.println(ch);
    }
}
