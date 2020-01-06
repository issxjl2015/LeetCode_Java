package main.algorithms.algo_190_颠倒二进制位;

public class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        int count = 0;
        while (count < 32) {
            ans <<= 1;
            ans |= (n & 1);
            n >>= 1;
            count++;
        }
        return ans;
    }
}
