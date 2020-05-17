package src.main.algorithms.algo_1099_小于K的两数之和;

import java.util.Arrays;

public class SolutionTwo {
    public int twoSumLessThanK(int[] A, int K) {
        if (A == null || A.length < 2) {
            return -1;
        }
        int res = -1;
        Arrays.sort(A);

        // 双指针
        int left = 0,
            right = A.length - 1;
        while (left < right) {
            int sum = A[left] + A[right];
            // 确保满足：sum < K 且 sum 是最接近 K 的和
            if (sum < K && (res == -1 || K - res > K - sum)) {
                res = sum;
            }

            if (sum >= K) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SolutionTwo solution = new SolutionTwo();
        int[] A = {358,898,450,732,672,672,256,542,320,573,423,543,591,280,399,
                923,920,254,135,952,115,536,143,896,411,722,815,635,353,486,127,
                146,974,495,229,21,733,918,314,670,671,537,533,716,140,599,758,
                777,185,549};
        int K = 1800;
        int ans = solution.twoSumLessThanK(A, K);
        System.out.println(ans);
    }
}
