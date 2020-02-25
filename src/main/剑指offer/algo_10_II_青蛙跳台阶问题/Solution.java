package main.剑指offer.algo_10_II_青蛙跳台阶问题;

public class Solution {
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n <= 2) {
            return n;
        }
        long first = 1;
        long second = 2;
        for (int i = 3; i <= n; i++) {
            long nval = first + second;
            first = second;
            second = nval % 1000000007;
        }
        return (int) second;
    }
}
