package main.weeklyContest.weekly_contest_179.contest_5354_通知所有员工所需的时间;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < manager.length; i++) {
           if (!map.containsKey(manager[i])) {
               map.put(manager[i], informTime[i]);
           }
        }
        for (Integer temp : map.values()) {
            count += temp;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 15;
        int headID = 0;
        int[] manager = {-1,0,0,1,1,2,2,3,3,4,4,5,5,6,6};
        int[] informTime = {1,1,1,1,1,1,1,0,0,0,0,0,0,0,0};
//        int n = 6;
//        int headID = 2;
//        int[] manager = {2,2,-1,2,2,2};
//        int[] informTime = {0,0,1,0,0,0};
        int ans = solution.numOfMinutes(n, headID, manager, informTime);
        System.out.println(ans);
    }
}
