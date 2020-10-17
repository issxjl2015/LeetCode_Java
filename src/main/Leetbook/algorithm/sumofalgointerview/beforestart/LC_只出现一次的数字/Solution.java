package Leetbook.algorithm.sumofalgointerview.beforestart.LC_只出现一次的数字;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 2, 1};
        int ans = solution.singleNumber(nums);
        System.out.println(ans);
    }
}
