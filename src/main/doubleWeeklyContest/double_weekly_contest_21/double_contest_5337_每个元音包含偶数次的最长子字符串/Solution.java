package main.doubleWeeklyContest.double_weekly_contest_21.double_contest_5337_每个元音包含偶数次的最长子字符串;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Character, Integer> map;
    public void mapInit() {
        map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
    }

    public int findTheLongestSubstring(String s) {
        int cnt = 0, temp = 0;
        for (int l = 0; l < s.length(); l++) {
            int r = l, sum = 0;
            mapInit();
            while ( r < s.length()) {
                if (map.containsKey(s.charAt(r))) {
                    map.put(s.charAt(r), map.get(s.charAt(r)) + 1);
                }
                r++;
                if (isEvent(map)) {
                    sum = r - l + 1;
                }
                temp = Math.max(temp, sum);
            }
            cnt = temp;
        }
        return cnt;
    }

    private boolean isEvent(Map<Character, Integer> maps) {
        if (maps.get('a') % 2 == 0 && maps.get('e') % 2 == 0 && maps.get('i') % 2 == 0 && maps.get('o') % 2 == 0 && maps.get('u') % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.findTheLongestSubstring("eleetminicoworoep");
        System.out.println(ans);
    }
}
