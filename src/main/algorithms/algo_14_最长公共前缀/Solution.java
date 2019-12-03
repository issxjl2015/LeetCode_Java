package main.algorithms.algo_14_最长公共前缀;

/**
 * 最长公共前缀——最长，公共，前缀
 * 前缀表示第一个字母就要相同
 * 公共表示大家都有
 * 最长表示存在多个的时候，选择一个最长的返回
 * */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 0; i < strs.length; i++) {
            int j = 0;
            for (; j < ans.length() && j < strs[i].length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0, j);
            if (ans.equals("")) {
                return ans;
            }
        }
        return ans;
    }
}
