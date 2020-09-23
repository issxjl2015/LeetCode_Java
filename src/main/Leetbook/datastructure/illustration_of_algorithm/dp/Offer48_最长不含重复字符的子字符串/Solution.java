package Leetbook.datastructure.illustration_of_algorithm.dp.Offer48_最长不含重复字符的子字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * 这道题双指标比较好理解
 * 通过左右两个指针，维护一个不包含重复元素的窗口
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = -1, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                l = Math.max(l, map.get(s.charAt(i))); // 易错点
            }
            map.put(s.charAt(i), i);
            ans = Math.max(ans, i - l);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abba";
        int ans = solution.lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}
