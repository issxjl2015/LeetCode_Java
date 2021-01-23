package doubleWeeklyContest.double_weekly_contest_44.double_contest_5645_找到最高海拔;

public class Solution {
    public int largestAltitude(int[] gain) {
        if (gain == null || gain.length < 2) {
            return 0;
        }

        int h = 0, ans = 0;
        for (int g : gain) {
            h += g;
            ans = Math.max(h, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] gain = {-5, 1, 5, 0, -7};
        int ans = solution.largestAltitude(gain);
        System.out.println(ans);
    }
}
