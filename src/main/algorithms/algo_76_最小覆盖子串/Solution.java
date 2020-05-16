package src.main.algorithms.algo_76_最小覆盖子串;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        // 字符串 s 对应的map
        Map<Character, Integer> need = new HashMap<>();
        // 滑动窗口内字符串对应的map
        Map<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0, vaild = 0;
        // 记录最小覆盖子串的起始索引及长度
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            // c 是将移入窗口的字符
            char c = s.charAt(right);
            // 右移窗口
            right++;
            // 进行窗口内数据的一系列更新
            if (need.get(c) > 0) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c) == need.get(c)) {
                    vaild++;
                }
            }

            // 判断左侧窗口是否要收缩
            while (vaild == need.size()) {
                // 更新覆盖最小覆盖子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                // d 是将移出窗口的字符
                char d = s.charAt(left);
                // 左移窗口
                left++;
                // 进行窗口内数据的更新
                if (need.containsKey(d)) {
                    if (window.get(d) == need.get(d)) {
                        vaild--;
                        window.put(d, window.get(d) - 1);
                    }
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, len);
    }
}
