package main.algorithms.algo_200_快乐数;

import java.util.HashSet;

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
