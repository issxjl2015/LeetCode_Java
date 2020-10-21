package Leetbook.algorithm.sumofalgointerview.arrayalgo.LC_两个数组的交集II;

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (map.containsKey(i)) {
                list.add(i);
                if (map.get(i) > 1) {
                    map.put(i, map.get(i) - 1);
                } else {
                    map.remove(i);
                }
            }
        }
        int len = list.size();
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
