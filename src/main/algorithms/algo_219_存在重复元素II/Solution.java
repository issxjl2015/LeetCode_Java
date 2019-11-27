package main.algorithms.algo_219_存在重复元素II;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * 思路：
 * 标签：哈希
 * 维护一个哈希表，里面始终最多包含 k 个元素，当出现重复值时则说明在 k 距离内存在重复元素
 * 每次遍历一个元素则将其加入哈希表中，如果哈希表的大小大于 k，则移除最前面的数字
 * 时间复杂度：O(n)O(n)，nn 为数组长度
 *
 * */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i-k]);
            }
        }
        return false;

        // 解法二：想用map,后来发现不能解决多个索引的问题，就放弃了
//        Map<Integer, Integer> map = new HashMap<>();
//        boolean flag = false;
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                int index = map.get(nums[i]);
//                if (i - index != k) {
//                    map.put(nums[i], i);
//                } else if (i - index == k) {
//                    flag = true;
//                }
//            } else {
//                map.put(nums[i], i);
//            }
//        }
//        return flag;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr  = {1, 2, 3, 1};
        boolean flag = solution.containsNearbyDuplicate(arr, 3);
        System.out.println(flag);
        int[] arr2  = {1, 0, 1, 1};
        boolean flag2 = solution.containsNearbyDuplicate(arr2, 1);
        System.out.println(flag2);
        int[] arr3  = {1, 2, 3, 1, 2, 3};
        boolean flag3 = solution.containsNearbyDuplicate(arr3, 2);
        System.out.println(flag3);
    }
}
