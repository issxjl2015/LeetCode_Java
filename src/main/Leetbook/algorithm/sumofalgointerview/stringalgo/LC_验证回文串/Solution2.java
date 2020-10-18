package Leetbook.algorithm.sumofalgointerview.stringalgo.LC_验证回文串;

/**
 * 题目：回文串
 * 思路：1、字符s转成全小写字符串
 *      2、双指针，左指针在最左侧，右指针在最右侧，向中间移动
 *      3、直到两个指针相遇或者越界
 */
public class Solution2 {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int l = 0, r = s.length() - 1;
        String ss = s.toLowerCase();
        while (l <= r) {
            while (l < ss.length() && !Character.isLetterOrDigit(ss.charAt(l))) {
                l++;
            }
            while (r >= 0 && !Character.isLetterOrDigit(ss.charAt(r))) {
                r--;
            }
            if (l < ss.length() && r >= 0 && ss.charAt(l++) != ss.charAt(r--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
//        String s = "A man, a plan, a canal: Panama";
        String s = " ";
        boolean ans = solution.isPalindrome(s);
        System.out.println(ans);
    }
}
