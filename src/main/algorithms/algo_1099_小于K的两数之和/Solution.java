package src.main.algorithms.algo_1099_小于K的两数之和;

/**
 * 采用暴力解法，123个用例通过了113个
 * 其中一个用例无法理解。
 * 用例如下：
 * [358,898,450,732,672,672,256,542,320,573,423,543,591,280,399,923,920,254,135,952,115,536,143,896,411,722,815,635,353,486,127,146,974,495,229,21,733,918,314,670,671,537,533,716,140,599,758,777,185,549] 1800
 *
 * 预期结果是：1794
 * 我的输出是：1796
 *
 * 题意：使它们的和小于 K 但尽可能地接近 K
 * 1800 - 1796 = 4 < 1800 - 1794 = 6
 * 很明显，应该是1796是正确答案，无法理解。MARK一下
 *
 * update：
 * 通过打印下标，发现1796 不是两个数的和，1794才应该是正确的
 */
public class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        if (A == null || A.length == 0) {
            return -1;
        }
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int temp = A[i] + A[j];
                if (temp >= K) {
                    continue;
                } else {
                    if (Math.abs(temp - K) < Math.abs(sum - K)) {
                        sum = temp;
                    }
                }
            }
        }
        return sum == Integer.MIN_VALUE ? -1 : sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {358,898,450,732,672,672,256,542,320,573,423,543,591,280,399,
                923,920,254,135,952,115,536,143,896,411,722,815,635,353,486,127,
                146,974,495,229,21,733,918,314,670,671,537,533,716,140,599,758,
                777,185,549};
        int K = 1800;
        int ans = solution.twoSumLessThanK(A, K);
        System.out.println(ans);
    }
}
