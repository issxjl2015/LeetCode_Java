package targetString.字符串中的第一个唯一字符;

/**
 * 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 *
 *
 * 注意事项：您可以假定该字符串只包含小写字母。
 *
 * 思路：利用字符在字符串中不同位置有不同的下标，如果只有一个字符，
 *       那么第一次出现和最后一次出现有相同的下标
 * */

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

    public static void main(String[] args) {
        Solution solution = new Solution();
        int index = solution.firstUniqChar("leetcode");
        System.out.println(index);
    }
}
