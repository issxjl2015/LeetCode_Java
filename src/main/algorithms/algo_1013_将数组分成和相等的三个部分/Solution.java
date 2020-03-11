package main.algorithms.algo_1013_将数组分成和相等的三个部分;

public class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        if (A == null || A.length < 3) {
            return false;
        }
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        if (sum % 3 != 0) {
            return false;
        }
        sum /= 3;
        int cntSum = 0, cnt = 0;
        for (int i = 0; i < A.length - 1; i++) {
            cntSum += A[i];
            if (cntSum == sum) {
                cnt++;
                if (cnt == 2) {
                    return true;
                }
                cntSum = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {18,12,-18,18,-19,-1,10,10};
        boolean flag = solution.canThreePartsEqualSum(A);
        System.out.println(flag);
    }
}
