package Leetbook.datastructure.illustration_of_algorithm.datastructure.Offer58_II_左旋转字符串;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() < n) {
            return s;
        }
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < len; i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
