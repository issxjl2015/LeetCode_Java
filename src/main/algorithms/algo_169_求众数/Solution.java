package main.algorithms.algo_169_求众数;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * */
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int majorEle = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int value = map.get(nums[i]) + 1;
                map.put(nums[i], value);
                // 是否是众数，其实在更新的时候就可以判断
                if (value > nums.length / 2) {
                    majorEle =  nums[i];
                    break;
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return majorEle;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int [] arr = {3, 2, 3};
        int [] arr = {8, 8, 7, 7, 7};
        int majorEle = solution.majorityElement(arr);
        System.out.println(majorEle);
    }
}
