package main.algorithms.algo_557_反转字符串中的单词III;

public class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            for (int j = s1[i].length() - 1; j >= 0; j--) {
                sb.append(s1[i].charAt(j));
            }
            if (i != s1.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
