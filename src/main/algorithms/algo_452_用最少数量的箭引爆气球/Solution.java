package algorithms.algo_452_用最少数量的箭引爆气球;

import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        // 不要使用 o1[1] - o2[1],
        // 否则会出现[[-2147483646,-2147483645],[2147483646,2147483647]]用例不通过
        Arrays.sort(points, (o1, o2) -> Integer.compare(o1[1], o2[1]));

        int cnt = 1;
        int x_end = points[0][1];
        for (int[] point : points) {
            int start = point[0];
            if (start > x_end) {
                cnt++;
                x_end = point[1];
            }
        }
        return cnt;
    }
}
