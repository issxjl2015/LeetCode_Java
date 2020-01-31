package main.algorithmSummary.binarySearch.algo_2_查找最后一个值等于给定值的元素;

/**
 * 查找最后一个值等于给定值的元素.
 *
 * 核心逻辑：
 * 1、如果 a[mid] 这个元素已经是数组中的最后一个元素了，那它肯定是我们要找的；
 * 2、如果 a[mid] 的后一个元素 a[mid+1] 不等于 value，那也说明 a[mid] 就是我们要找的最后一个值等于给定值的元素。
 * 3、如果我们经过检查之后，发现 a[mid] 后面的一个元素 a[mid+1] 也等于 value，那说明当前的这个 a[mid] 并不是最后一个值等于给定值的元素。
 * 4、我们就更新 low=mid+1，因为要找的元素肯定出现在 [mid+1, high] 之间。
 */
public class Solution {
    public int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == n - 1 || (a[mid] + 1) != value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
        int n = 10;
        int value = 8;
        int ans = solution.bsearch(a, n, value);
        System.out.println(ans);
    }
}
