package main.algorithms.algo_532_数组中的K_diff数对;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findPairs(int[] nums, int k) {
        int rst = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (k == 0) {
                if (set.contains(nums[i])) {
                    rst += 1;
                    set.remove(nums[i]);
                } else {
                    set.add(nums[i]);
                }
            } else {
                set.add(nums[i]);
            }
        }
        if (k == 0) {
            return rst;
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - k)) {
                rst += 1;
            }
            if (set.contains(nums[i] + k)) {
                rst += 1;
            }
            if (set.contains(nums[i] - k) || set.contains(nums[i] + k)) {
                    set.remove(nums[i]);
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = {3, 1, 4, 1, 5};
//        int resutlt = solution.findPairs(arr, 2);
//        System.out.println(resutlt);
//        System.out.println("=====================");
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int resutlt1 = solution.findPairs(arr1, -1);
//        System.out.println(resutlt1);
//        System.out.println("=====================");
//        int[] arr2 = {3, 1, 4, 1, 5};
//        int resutlt2 = solution.findPairs(arr2, 2);
//        System.out.println(resutlt2);
        int[] arr2 = {1, 1, 1, 2, 1};
        int resutlt2 = solution.findPairs(arr2, 1);
        System.out.println(resutlt2);
    }
}
