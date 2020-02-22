package main.weeklyContest.weekly_contest_176.contest_5342_最多可以参加的会议数目;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (e1, e2) -> Integer.compare(e1[0], e2[0]));

        // 优先队列按照结束时间排序
        PriorityQueue<int[]> pq = new PriorityQueue<>((e1, e2) -> Integer.compare(e1[1], e2[1]));

        int N = events.length;
        int i = 0;
        int d = 1;
        int count = 0;
        while (i < N || !pq.isEmpty()) {
            // 模拟第 d 天的决策
            // 将已经开始的会议加入队列
            while (i < N && events[i][0] <= d) {
                pq.add(events[i]);
                i++;
            }

            // 找出一个可以参加的最早结束的会议
            while (!pq.isEmpty()) {
                int[] e = pq.poll();
                if (e[1] >= d) {
                    count++;
                    break;
                }
            }
            d++;
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] events = {{1, 2}, {2, 3}, {3, 4}, {1, 2}};
        int[][] events = {{1, 4}, {4, 4}, {2, 2}, {3, 4}, {1, 1}};
        int ans = solution.maxEvents(events);
        System.out.println(ans);
    }
}
