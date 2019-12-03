package main.algorithms.algo_167_两数之和II_输入有序数组;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[]{};
        for (int i = 0; i < numbers.length; i++) {
            if (!map.containsKey(numbers[i])) {
                map.put(numbers[i], i + 1);
            }
            int deta = target - numbers[i];
            if (map.containsKey(deta) && (i + 1) != map.get(deta)) {
                result = new int[]{map.get(target - numbers[i]), i + 1};
            }
        }
        return result;
    }
}
