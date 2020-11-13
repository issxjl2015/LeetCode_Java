package algorithms.algo_414_第三大的数;

import java.util.TreeSet;

public class Solution2 {
    public int thirdMax(int[] nums) {
        if (nums == null || nums.length < 3) {
            return -1;
        }

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : nums) {
            set.add(i);
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }
        return set.size() < 3 ? set.last() : set.first();
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] nums = {1, 3, 2, 5, 7, 5, 4, 7};
        int ans = solution2.thirdMax(nums);
        System.out.println(ans);
    }
}
