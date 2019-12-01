package main.algorithms.algo_509_斐波那契数;

public class Solution {
    public int fib(int N) {
        int curr = 0, next = 1;
        while(N-- > 0) {
            next = next + curr;
            curr = next - curr;
        }
        return curr;
    }
}
