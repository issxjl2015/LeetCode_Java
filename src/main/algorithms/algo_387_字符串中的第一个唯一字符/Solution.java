package main.algorithms.algo_387_字符串中的第一个唯一字符;

public class Solution {
    public int firstUniqChar(String s) {
        char[] chArr = s.toCharArray();
        int index = -1;
        for (char ch : chArr) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                index =  s.indexOf(ch);
                break;
            }
        }
        return index;
    }
}
