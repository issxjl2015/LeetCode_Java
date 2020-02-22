package main.weeklyContest.weekly_contest_171.contest_2_或运算的最小翻转次数;

public class Solution {
    public int minFlips(int a, int b, int c) {
        int ans=0;
        for (int i = 0;i < 31; ++i){
            if ((c&(1<<i)) == 1) {
                if ((a&(1<<i)) == 1 && ((b&(1<<i))) == 1) ++ans;
            }
            else {
                if ((a&(1<<i)) == 0) ++ans;
                if ((b&(1<<i)) == 0) ++ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.minFlips(2, 6, 5);
        System.out.println(ans);
    }
}
