package kexinleetcode.stringalgo.LC_最后一个单词的长度;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] sarr = s.trim().split(" ");
        int len = sarr.length;
        return sarr[len - 1].length();
    }
}
