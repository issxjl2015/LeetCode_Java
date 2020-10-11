package Leetbook.datastructure.illustration_of_algorithm.bitoperation.Offer15_二进制中1的个数;

public class Solution {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt += n & 1;
            n >>>= 1;
        }
        return cnt;
    }
}
