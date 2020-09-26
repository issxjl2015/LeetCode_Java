package Leetbook.datastructure.illustration_of_algorithm.searchalgorithm.Offer53II_0_n减1中缺失的数字;

public class Solution {
    public int missingNumber(int[] nums) {
        int[] ans = new int[nums.length  + 1];
        for (int i : nums) {
            ans[i]++;
        }
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
