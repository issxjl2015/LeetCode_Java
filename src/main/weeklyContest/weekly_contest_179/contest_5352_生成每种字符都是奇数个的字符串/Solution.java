package main.weeklyContest.weekly_contest_179.contest_5352_生成每种字符都是奇数个的字符串;

public class Solution {
    public String generateTheString(int n) {
        if (n == 1) {
            return "a";
        }
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 1) {
            while (n - 2 > 0) {
                sb.append('a');
                n--;
            }
            sb.append('b').append('c');
        } else {
            while(n - 1 > 0) {
                sb.append('a');
                n--;
            }
            sb.append('b');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.generateTheString(4);
        System.out.println(ans);
    }
}
