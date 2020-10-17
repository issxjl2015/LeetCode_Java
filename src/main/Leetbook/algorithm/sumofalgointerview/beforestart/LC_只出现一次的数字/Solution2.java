package Leetbook.algorithm.sumofalgointerview.beforestart.LC_只出现一次的数字;

public class Solution2 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
