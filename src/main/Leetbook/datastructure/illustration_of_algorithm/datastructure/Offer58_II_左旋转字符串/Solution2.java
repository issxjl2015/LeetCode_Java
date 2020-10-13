package Leetbook.datastructure.illustration_of_algorithm.datastructure.Offer58_II_左旋转字符串;

public class Solution2 {
    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() < n) {
            return s;
        }
        String s1 = s.substring(n);
        String s2 = s.substring(0, n);
        return s1 + s2;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        solution.reverseLeftWords("avcgaivb", 2);
    }

}
