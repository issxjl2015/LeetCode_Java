package main.algorithms.algo_202_快乐数;

import java.util.HashSet;

/**
 * 编写一个算法来判断一个数是不是“快乐数”。
 *
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 *
 * 示例: 
 *
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 *
 * */
public class Solution {
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        HashSet<Integer> set = new HashSet<>();
        int temp = n;
        while (temp != 1) {
           String in = String.valueOf(temp);
           temp = 0;
            for (int i = 0; i < in.length(); i++) {
                int tmp = Integer.valueOf(in.substring(i, i+1));
                temp += tmp * tmp;
            }
            if (set.contains(temp)) {
                return false;
            }
            if (temp == 1) {
                return true;
            } else {
                set.add(temp);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean flag = solution.isHappy(1);
        System.out.println(flag);
    }
}
