package Leetbook.datastructure.illustration_of_algorithm.searchalgorithm.Offer53_I_在排序数组中查找数字I;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int search(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        if (map.containsKey(target)) {
            return map.get(target);
        }
        return 0;
    }
}
