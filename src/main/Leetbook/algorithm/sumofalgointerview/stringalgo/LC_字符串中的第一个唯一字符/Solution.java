package Leetbook.algorithm.sumofalgointerview.stringalgo.LC_字符串中的第一个唯一字符;

public class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'0']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - '0'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
