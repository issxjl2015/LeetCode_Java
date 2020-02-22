package main.weeklyContest.weekly_contest_175.contest_5332_检查整数及其两倍数是否存在;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i] * 2 == arr[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
