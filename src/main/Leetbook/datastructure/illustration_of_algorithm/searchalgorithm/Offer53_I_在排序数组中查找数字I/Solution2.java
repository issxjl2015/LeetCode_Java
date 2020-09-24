package Leetbook.datastructure.illustration_of_algorithm.searchalgorithm.Offer53_I_在排序数组中查找数字I;

public class Solution2 {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                int ll = mid, rr = mid;
                while (ll >= 0 && nums[ll] == target) {
                    ll--;
                }
                while (rr < nums.length && nums[rr] == target) {
                    rr++;
                }
                return rr - ll - 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] nums = {1,2,3,3,3,3,4,5,9};
        int target = 3;
        System.out.println(solution2.search(nums, target));
    }
}
