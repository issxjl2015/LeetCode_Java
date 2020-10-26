package kexinleetcode.arrayalgo.LC_四数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length == 4) {
            int sum = nums[0] + nums[1] + nums[2] + nums[3];
            if (sum == target) {
                List<Integer> list = Arrays.asList(nums[0], nums[1], nums[2], nums[3]);
                ans.add(list);
                return ans;
            }
        }

        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int sum = target - nums[i];
            // 此处的判断是跳过重复数的，测试用例：[-1,-5,-5,-3,2,5,0,4], target = -7
            // 要在执行三数之和的前面进行判断
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            preThirdSum(nums, i, sum, ans);
        }
        return ans;
    }

    private void preThirdSum(int[] nums, int i, int target, List<List<Integer>> list) {

        for (int j = i + 1; j < nums.length; j++) {
            // j > i + 1, 是因为 j 的起始是 i + 1, 要从 j 的后一位开始算
            if (j > i + 1 && nums[j] == nums[j - 1]) {
                continue;
            }
            int l = j + 1, r = nums.length - 1;
            while (l < r) {
                int cnt = nums[j] + nums[l] + nums[r];
                if (cnt == target) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else if (cnt > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {1, 0, -1, 0, -2, 2};
//        int[] nums = {1,-2,-5,-4,-3,3,3,5};
//        int target = -11;
        int[] nums = {-1,-5,-5,-3,2,5,0,4};
        int target = -7;
        List<List<Integer>> ans = solution.fourSum(nums, target);
        System.out.println(ans);
    }
}
