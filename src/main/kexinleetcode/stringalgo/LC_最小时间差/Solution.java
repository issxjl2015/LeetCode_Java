package kexinleetcode.stringalgo.LC_最小时间差;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints == null || timePoints.size() == 0) {
            return 0;
        }
        int[] times = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            int time = Integer.parseInt(timePoints.get(i).substring(0, 2)) * 60 + Integer.parseInt(timePoints.get(i).substring(3, 5));
            times[i] = time;
        }
        Arrays.sort(times);
        // 以 最后一位 与 第一位 的差 作为 基准
        int ans = 60 * 24 - times[times.length - 1] + times[0];
        for (int j = 1; j < times.length; j++) {
            if (times[j] - times[j - 1] < ans) {
                ans = times[j] - times[j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        List<String> list = Arrays.asList("00:00", "12:10", "23:00", "23:50");
//        List<String> list = Arrays.asList("00:00", "23:59");
        List<String> list = Arrays.asList("06:00","23:59","10:00", "23:11");
        int ans = solution.findMinDifference(list);
        System.out.println(ans);
    }
}
