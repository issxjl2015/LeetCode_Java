package main.weeklyContest.weekly_contest_178.contest_5344_有多少小于当前数字的数字;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] > nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {8,1,2,2,3};
        int[] ans = solution.smallerNumbersThanCurrent(nums);
        System.out.println(ans);
    }
}
