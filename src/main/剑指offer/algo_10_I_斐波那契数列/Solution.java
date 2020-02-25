package main.剑指offer.algo_10_I_斐波那契数列;

public class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        long first = 0;
        long second = 1;
        for (int i = 2; i <= n; i++) {
            long nval = first + second;
            first = second;
            second = nval % 1000000007;
        }
        return (int) second;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.fib(5);
        System.out.println(ans);
    }
}
