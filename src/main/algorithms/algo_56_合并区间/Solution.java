package main.algorithms.algo_56_合并区间;

import java.util.*;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <=1) return intervals;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int i = 1; i < intervals.length ; i++) {
            if (intervals[i][0] <= intervals[i-1][1]){
                intervals[i][0] = intervals[i][0] < intervals[i-1][0] ? intervals[i][0] : intervals[i-1][0];
                intervals[i][1] = intervals[i][1] < intervals[i-1][1] ? intervals[i-1][1] : intervals[i][1];
            } else {
                list.add(intervals[i-1]);
            }
            if (i == intervals.length - 1){
                list.add(intervals[i]);
            }
        }
        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] [] intervals = {{5, 8}, {1, 3}, {2, 7}, {6, 9}, {11, 14}};
        int[][] ans = solution.merge(intervals);
        System.out.println(ans);
    }
}
