package main.weeklyContest.weekly_contest_175.contest_5333_制造字母异位词的最小步骤;

public class Solution {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }
        int sum = 0;
        for (int c : arr) {
            if (c > 0) {
                sum += c;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int sum = solution.minSteps("aba", "bba");
        System.out.println(sum);
    }
}
