package main.algorithmSummary.binarySearch.algo_1_查找第一个值等于给定值的元素;

/**
 * 有序数据集合中存在重复的数据，我们希望找到第一个值等于给定值的数据
 *
 * 核心逻辑：
 * 1、如果 mid 等于 0，那这个元素已经是数组的第一个元素，那它肯定是我们要找的；
 * 2、如果 mid 不等于 0，但 a[mid] 的前一个元素 a[mid-1] 不等于 value，那也说明a[mid] 就是我们要找的第一个值等于给定值的元素。
 * 3、如果经过检查之后发现 a[mid] 前面的一个元素 a[mid-1] 也等于 value，那说明此时的 a[mid]肯定不是我们要查找的第一个值等于给定值的元素。
 * 4、那我们就更新 high=mid-1，因为要找的元素肯定出现在 [low, mid-1] 之间。
 */
public class Solution {
    public int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value){
                low = mid + 1;
            } else {
                if ((mid == 0) || (a[mid - 1] != value)) {
                    return mid;
                } else {
                    high = mid - 1;
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
