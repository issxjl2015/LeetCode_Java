package algorithms.algo_941_有效的山脉数组;

public class Solution {
    public boolean validMountainArray(int[] A) {
        if (A == null || A.length < 3) {
            return false;
        }

        // 山峰
        int index = 1;
        if (A[1] <= A[0]) {
            return false;
        }
        // 为啥A.length - 1， 因为山峰在最后，那肯定不是山脉
        for (; index < A.length - 1; index++) {
            if (A[index] < A[index - 1]) {
                break;
            } else if (A[index] == A[index - 1]) {
                return false;
            }
        }
        if (index == A.length - 1 || index < A.length - 1 && A[index] < A[index + 1]) {
            return false;
        }

        for (; index < A.length; index++) {
            if (A[index] > A[index + 1]) {
                continue;
            } else if (A[index] <= A[index + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {3, 5, 5};
        boolean falg = solution.validMountainArray(A);
        System.out.println(falg);
    }
}
