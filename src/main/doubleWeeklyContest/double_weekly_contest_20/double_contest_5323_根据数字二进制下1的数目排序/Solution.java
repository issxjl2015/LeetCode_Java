package main.doubleWeeklyContest.double_weekly_contest_20.double_contest_5323_根据数字二进制下1的数目排序;

import java.util.*;

public class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] result = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (getNum(a) == getNum(b)) {
                    return a - b;
                }
                return getNum(a) - getNum(b);
            }
        });
        return Arrays.stream(result).mapToInt(Integer::valueOf).toArray();
    }

    public int getNum(int value) {
        int count = 0;
        while (value > 0) {
            value = value & (value - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {6}; // 0110
        int[] ans = solution.sortByBits(arr);
    }
}
