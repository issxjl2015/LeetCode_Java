package Leetbook.datastructure.LeetCodeCookbook.arrayAlgo;

import java.util.HashMap;
import java.util.Map;

public class Algo_1_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        // key: nums[i], value: index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
            int tmp = target - nums[i];
            if (map.containsKey(tmp) && (i != map.get(tmp))) {
                return new int[] {i, map.get(target - nums[i])};
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Algo_1_两数之和 solution = new Algo_1_两数之和();
        int[] nums = {3, 3};
        int target = 6;
        int[] ans = solution.twoSum(nums, target);
        System.out.println(ans);
    }
}
