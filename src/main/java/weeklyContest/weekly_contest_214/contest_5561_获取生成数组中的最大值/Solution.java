package weeklyContest.weekly_contest_214.contest_5561_获取生成数组中的最大值;

public class Solution {
    public int getMaximumGenerated(int n) {
        if (n < 2) {
            return n;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int ans = nums[1];
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                nums[i] = nums[i / 2];
                ans = Math.max(ans, nums[i]);
            } else {
                nums[i] = nums[i / 2] + nums[i / 2 + 1];
                ans = Math.max(ans, nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4;
        int ans = solution.getMaximumGenerated(n);
        System.out.println(ans);
    }
}
