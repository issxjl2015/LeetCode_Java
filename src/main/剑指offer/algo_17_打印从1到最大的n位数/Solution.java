package main.剑指offer.algo_17_打印从1到最大的n位数;

public class Solution {
    public int[] printNumbers(int n) {
        int count = 0;
        while (n-- != 0) {
            count = count * 10 + 9;
        }
        System.out.println(count);
        int[] ans = new int[count];
        for (int i = 0; i < count; i++) {
            ans[i] = i + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.printNumbers(2);
        System.out.println(ans.length);
    }
}
