package main.weeklyContest.weekly_contest_179.contest_5353_灯泡开关III;

public class Solution {
    public int numTimesAllBlue(int[] light) {
        boolean[] flagArr = new boolean[light.length];
        for (boolean flagTemp : flagArr) {
            flagTemp = false;
        }
        int count = 0;
        for (int i = 0; i < light.length; i++) {
            flagArr[light[i] - 1] = true;
            int index = i;
            boolean flag = true;
            while (index >= 0) {
                if (!flagArr[index]) {
                    flag = false;
                    break;
                }
                index--;
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] light = {2, 1, 3, 5, 4};
        int ans = solution.numTimesAllBlue(light);
        System.out.println(ans);
    }
}
