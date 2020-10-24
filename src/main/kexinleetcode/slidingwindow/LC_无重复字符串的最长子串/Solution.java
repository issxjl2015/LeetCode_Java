package kexinleetcode.slidingwindow.LC_无重复字符串的最长子串;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        // 双指针
        Map<Character, Integer> map = new HashMap<>();
        // l r 表示滑动窗口的边界
        int l = 0, r = 0;
        int ans = 1;
        while (r < s.length()) {
            if (map.containsKey(s.charAt(r))) {
                // 存在重复元素，则将左边界右移
                l = Math.max(l , map.get(s.charAt(r)) + 1);
            }
            //每次都去判断ans是否为最大值
            ans = Math.max(ans, r - l + 1);
            map.put(s.charAt(r), r);
            r++;
        }
        return ans;
    }
}
