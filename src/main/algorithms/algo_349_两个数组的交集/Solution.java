package main.algorithms.algo_349_两个数组的交集;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        int[] result = new int[]{};
        if (set1.size() > set2.size()) {
            result = inter(set1, set2);
        } else {
            result = inter(set2, set1);
        }
        return result;
    }

    public int[] inter(HashSet<Integer> set1, HashSet<Integer> set2) {
        int[] output = new int[set1.size()];
        int idx = 0;
        for (Integer i : set1) {
            if (set2.contains(i)) {
                output[idx++] = i;
            }
        }
        return Arrays.copyOf(output, idx);
    }
}
