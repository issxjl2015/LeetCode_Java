package main.algorithms.algo_973_最接近原点的K个点;

import java.util.Arrays;

public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[] dist = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            dist[i] = distitan(points[i]);
        }
        Arrays.sort(dist);
        int[][] ans = new int[K][2];
        int j = 0;
        for (int i = 0; i < points.length; i++) {
            if (distitan(points[i]) <= dist[K-1]) {
                ans[j++] = points[i];
            }
        }
        return ans;
    }
    private int distitan(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
