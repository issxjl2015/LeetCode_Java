package Leetbook.datastructure.illustration_of_algorithm.datastructure.Offer05_替换空格;

public class Solution {
    public String replaceSpace(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "     ";
        String ans = solution.replaceSpace(s);
        System.out.println(ans);
    }
}
