package weeklyContest.weekly_contest_212.contest_5547_等差子数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            Boolean flag = checkFunc(nums, l[i], r[i]);
            list.add(flag);
        }
        return list;
    }

    private Boolean checkFunc(int[] nums, int l, int r) {
        int len = r - l + 1;
        int[] numss = new int[len];
        for (int i = l; i <= r; i++) {
            numss[i - l] = nums[i];
        }
        Arrays.sort(numss);
        for (int i = len - 1; i >= 2; i--) {
            if ((numss[i] - numss[i - 1]) != (numss[i - 1] - numss[i - 2])) {
                return false;
            }
        }
        return true;
    }
}
