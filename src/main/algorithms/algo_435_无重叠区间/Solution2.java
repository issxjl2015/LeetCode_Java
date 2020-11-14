package algorithms.algo_435_无重叠区间;

import java.util.Arrays;

public class Solution2 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, ((o1, o2) -> o1[1] - o2[1]));
        int cnt = 1;
        int x_end = intervals[0][1];
        for (int[] interval : intervals) {
            int start = interval[0];
            if (start >= x_end) {
                cnt++;
                x_end = interval[1];
            }
        }
        return intervals.length - cnt;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
        int ans = solution2.eraseOverlapIntervals(intervals);
        System.out.println(ans);
    }
}
