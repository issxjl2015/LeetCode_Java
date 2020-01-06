package main.algorithms.algo_191_位1的个数;

public class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                ans++;
            }
            mask <<= 1;
        }
        return ans;
    }
}
