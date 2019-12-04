package main.algorithms.algo_561_数组拆分I;

import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            result = nums[i];
        }
        return result;
    }
}
