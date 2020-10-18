package Leetbook.algorithm.sumofalgointerview.stringalgo.LC_验证回文串;


/**
 * 题目：验证回文串
 * 思路：1、得到字符串s中所有的字母和数字
 *      2、逆转字符串，看两个字符串是否为同一个字符串，即可验证是否为回文串
 */
public class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        String ss = sb.toString().toLowerCase();
        StringBuffer ssb = new StringBuffer();
        for (int i = ss.length() - 1; i >= 0; i--) {
            ssb.append(ss.charAt(i));
        }
        String tt = ssb.toString().toLowerCase();
        if (ss.equals(tt)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "A man, a plan, a canal: Panama";
        boolean ans = solution.isPalindrome(s);
        System.out.println(ans);
    }
}
