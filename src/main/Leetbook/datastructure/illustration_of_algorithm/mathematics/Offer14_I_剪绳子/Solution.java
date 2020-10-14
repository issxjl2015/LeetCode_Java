package Leetbook.datastructure.illustration_of_algorithm.mathematics.Offer14_I_剪绳子;

public class Solution {
    public int cuttingRope(int n) {
        if (n <= 3) {
            // 规则是：m > 1，所以至少要剪出一段长度为 1 的绳子
            return n - 1;
        }
        int a = n / 3, b = n % 3;
        if (b == 0) {
            return (int) Math.pow(3, a);
        }
        if (b == 1) {
            // 4 =  2 * 2， 是由一段3和一段1，拆出来的
            return (int) Math.pow(3, a - 1) * 4;
        }
        return (int) Math.pow(3, a) * 2;
    }
}
