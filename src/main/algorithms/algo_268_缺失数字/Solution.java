package main.algorithms.algo_268_缺失数字;

public class Solution {
    public int missingNumber(int[] nums) {
        int allSum = (nums.length + 1) * nums.length / 2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
           sum += nums[i];
        }
        return allSum - sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 0, 1};
        int missNum = solution.missingNumber(arr);
        System.out.println(missNum);
    }
}
