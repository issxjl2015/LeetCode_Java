package main.algorithms.algo_27_移除元素;

/**
 * 算法核心：拷贝覆盖，双指针
 * 当nums[i] 与给定的值相等时，递增 i 以跳过该元素。
 * 若nums[i] 与给定的值不相等时，就复制nums[i]到nums[k]并同时递增两个索引。
 * 重复这一过程，直到 i 到数组的末尾，该数组的新长度为 k
 * */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
