package Leetbook.algorithm.sumofalgointerview.stringalgo.LC_反转字符串;

public class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        int l = 0, r = s.length - 1;
        while (l < s.length && r >= 0 && l < r) {
            char ss = s[l];
            s[l] = s[r];
            s[r] = ss;
            l++;
            r--;
        }
    }
}
