package main.剑指offer.algo_03_数组中重复的数字;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                ans = i;
                break;
            }
            set.add(i);
        }
        return ans;
    }
}
