package main.algorithms.algo_66_加一;

/**
 * 算法核心：每一位都加一，当没有进位时，就直接返回
 * 若出现的进位不在最高位，则在出现进位的地方返回
 * 若出现的进位在最高位，则需要扩展数组的长度，并对高位赋值 1，并返回
 * */
public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > 0; i++) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
