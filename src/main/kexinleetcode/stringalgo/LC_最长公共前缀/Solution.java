package kexinleetcode.stringalgo.LC_最长公共前缀;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length < 1) {
            return "";
        }

        String s0 = strs[0];
        for (int i = 1; i < strs.length; i++) {
            s0 = commonPrefix(s0, strs[i]);
        }
        return s0;
    }

    private String commonPrefix(String s0, String s1) {
        int len = Math.min(s0.length(), s1.length());
        int i = 0;
        for (; i < len; i++) {
            if (s0.charAt(i) != s1.charAt(i)) {
                break;
            }
        }
        return s0.substring(0, i);
    }
}
