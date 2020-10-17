package Leetbook.algorithm.sumofalgointerview.beforestart.LC_多数元素;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > (nums.length / 2)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {2,2,1,1,1,1,1};
        int[] nums = {1,1,1,1,1,2,2,3,2,2,2,3,3,3,3,3,3,3,3,3,3};
        int ans = solution.majorityElement(nums);
        System.out.println(ans);
    }
}
