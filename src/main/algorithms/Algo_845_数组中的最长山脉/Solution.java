package algorithms.Algo_845_数组中的最长山脉;

public class Solution {
    public int longestMountain(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
        int l = 0, r = 0, mid = 0;
        int ans = 0;
        boolean flag = false;
        for (int i = 2; i < A.length; i++) {
            if (A[i] > A[i - 1] && A[i - 1] > A[i - 2]) {
                // 上升期
                mid = i;
                flag = true;
            } else if (A[i] < A[i - 1] && A[i - 1] < A[i - 2]) {
                // 下降期
                r = i;
                if (flag) {
                    ans = Math.max(ans, r - l + 1);
                }
            } else if (A[i] > A[i -1] && A[i - 1] < A[i - 2]) {
                // 下降上升期
                flag = true;
                r = i - 1;
                if (flag) {
                    ans = Math.max(ans, r - l + 1);
                }
                l = i - 1;
            } else if (A[i] < A[i - 1] && A[i - 1] > A[i - 2]) {
                // 上升下降期
                flag = true;
                mid = i - 1;
                r = i;
                ans = Math.max(ans, r - l + 1);
            }
        }
        if (ans < 3) {
            return 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] A = {0,1,2,3,4,5,4,3,2,1,0};
//        int[] A = {9,8,7,6,5,4,3,2,1,0};
        int[] A = {4,2,9,8,0};
        int ans = solution.longestMountain(A);
        System.out.println(ans);
    }
}
