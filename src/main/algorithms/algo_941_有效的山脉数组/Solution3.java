package algorithms.algo_941_有效的山脉数组;

public class Solution3 {
    public boolean validMountainArray(int[] A) {
        int len = A.length;
        int left = 0;
        int right = len - 1;

        while (left + 1 < len && A[left] < A[left + 1]) {
            left++;
        }

        while (right > 0 && A[right - 1] > A[right]) {
            right--;
        }

        // 判断从左边和右边找到的山峰是否是同一个
        return left > 0 && right < len - 1 && left == right;
    }
}
