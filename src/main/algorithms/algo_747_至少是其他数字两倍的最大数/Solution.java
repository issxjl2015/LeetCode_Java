package main.algorithms.algo_747_至少是其他数字两倍的最大数;

/**
 * 找到最大和第二大的数字就可以知道是否正确了
 * 当nums[i] > max时，对max赋值前，先将max的值赋值给secondmax
 * 当nums[i] > secondmax时，对secondmax进行赋值
 * */
public class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int max = -1;
        int index = 0;
        int secondmax = -1;
        for(int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                secondmax = max;
                max = nums[i];
                index = i;
            } else if (secondmax < nums[i]){
                secondmax = nums[i];
            }
        }
        return secondmax * 2 <= max ? index : -1;
    }
}
