package algorithms.algo_1024_视频拼接;

import java.util.Arrays;

public class Solution {
    public int videoStitching(int[][] clips, int T) {
        Arrays.sort(clips, (o1, o2) -> {
            return o1[0] - o2[0];
        });
        int[] dp = new int[clips.length + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < clips.length; i++) {
            int start = clips[i][0];
            int end = clips[i][1];
            if (dp[start] == Integer.MAX_VALUE) {
                break;
            }
            for (int j = start + 1; j <= end; j++) {
                dp[j] = Math.min(dp[j], dp[start] + 1);
            }
        }
        if (dp[T] == Integer.MAX_VALUE) {
            return -1;
        }
        return dp[T];
    }
}
