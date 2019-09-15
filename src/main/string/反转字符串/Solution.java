package src.main.string.反转字符串;

/**
 * 反转字符串
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 *
 *
 * 示例 1：
 *
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 示例 2：
 *
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 * */
public class Solution {
    public void reverseString(char[] s) {
        /**
         * 1, 不能分配额外的空间
         * 2，字符数组的长度不同，中间字符不同，要处理一下
         * 3，可以使用big O  = 1的额外空间来做中间处理
         * */
        for (int i = 0; i < (s.length / 2 == 0 ? s.length / 2 - 1 : s.length / 2); i++) {
            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length -i - 1] = tmp;
        }
    }
}
