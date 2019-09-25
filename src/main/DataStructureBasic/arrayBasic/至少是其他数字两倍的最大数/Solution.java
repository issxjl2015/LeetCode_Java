package DataStructureBasic.arrayBasic.至少是其他数字两倍的最大数;

import java.util.Arrays;

public class Solution {
    public int dominantIndex(int[] nums) {
       if (nums.length == 1) {
           return 0;
       }
       int max = -1;
       int secondmax = -1;
       int index = 0;
       for (int i = 0; i < nums.length; i++) {
           if (max <= nums[i]) {
               secondmax = max;
               max = nums[i];
               index = i;
           } else if (nums[i] < max && secondmax <= nums[i]) {
               secondmax = nums[i];
           }
       }
       System.out.println(max);
       System.out.println(secondmax);
       return secondmax * 2 <= max ? index : -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 6, 1, 0};
        int i = solution.dominantIndex(nums);
        System.out.println(i);
    }
}
