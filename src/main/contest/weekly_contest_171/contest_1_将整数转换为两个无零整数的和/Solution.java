package main.contest.weekly_contest_171.contest_1_将整数转换为两个无零整数的和;

public class Solution {
    public int[] getNoZeroIntegers(int n) {
        int A = 1;
        int B = n - 1;
        while (isFlag(A) || isFlag(B)) {
            A++;
            B--;
        }
        int [] ans = new int[2];
        ans[0] = A;
        ans[1] = B;
        return ans;
    }

    public boolean isFlag(int n) {
        // 默认是不含0的
        boolean flag = false;
        String in = String.valueOf(n);
        int i = 0;
        while (i < in.length()) {
            if ((in.substring(i, i+1).equals("0"))) {
                flag = true;
                break;
            }
            i++;
        }
        return flag;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.getNoZeroIntegers(1202);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
