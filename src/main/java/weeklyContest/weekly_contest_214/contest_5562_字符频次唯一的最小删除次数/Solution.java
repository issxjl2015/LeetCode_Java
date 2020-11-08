package weeklyContest.weekly_contest_214.contest_5562_字符频次唯一的最小删除次数;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minDeletions(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
             arr[s.charAt(i) - 'a']++;
        }

        Set<Integer> set = new HashSet<>();
        int ans = 0 ;
        for (int i : arr) {
            if (i != 0) {
                // 只要包含就一直减减
                while (set.contains(i)) {
                    i--;
                    ans++;
                }
                // 将新出现的值加入到set中
                if (i != 0) {
                    set.add(i);
                }
            }
        }

        return ans;
    }
}
