package main.algorithmSummary.binarySearch.algo_3_查找第一个大于等于给定值的元素;

/**
 * 查找第一个大于等于给定值的元素
 *
 * 核心逻辑：
 * 1、对于 a[mid] 大于等于给定值 value 的情况，我们要先看下这个 a[mid] 是不是我们要找的第一个值大于等于给定值的元素。
 * 2、如果 a[mid] 前面已经没有元素，或者前面一个元素小于要查找的值value，那 a[mid] 就是我们要找的元素。
 * 3、如果 a[mid-1] 也大于等于要查找的值 value，那说明要查找的元素在 [low, mid-1] 之间，所以，我们将 high 更新为 mid-1。
 */
public class Solution {
    public int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if ((mid == 0) || (a[mid - 1] < value)) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3, 4, 6, 7, 10};
        int n = 5;
        int value = 5;
        int ans = solution.bsearch(a, n, value);
        System.out.println(ans);
    }
}
