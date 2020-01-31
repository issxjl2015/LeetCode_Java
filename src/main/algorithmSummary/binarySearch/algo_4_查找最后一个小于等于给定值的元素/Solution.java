package main.algorithmSummary.binarySearch.algo_4_查找最后一个小于等于给定值的元素;

public class Solution {
    public int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else {
                if ((mid == n - 1) || a[mid + 1] > value) {
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
        int[] a = {3, 5, 6, 8, 9, 10};
        int n = 6;
        int value = 7;
        int ans = solution.bsearch(a, n, value);
        System.out.println(ans);
    }
}
