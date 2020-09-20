package Leetbook.datastructure.illustration_of_algorithm.datastructure.Offer20_表示数值的字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * 题解：https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/5dkal2/
 */
public class Solution {
    public boolean isNumber(String s) {
        // blank 表示 空格
        // sign  表示 符号，正负号
        // digit 表示 数字
        // dot   表示 小数点
        // e     表示 幂符号

        // 0     表示 起始的 blank
        // 1     表示 e 之前的 sign
        // 2     表示 dot 之前的 digit
        // 3     表示 dot 之后的 digit
        // 4     表示 当 dot 前为空时，dot 后的 digit
        // 5     表示 e
        // 6     表示 e 之后的 sign
        // 7     表示 e 之后的 digit
        // 8     表示 尾部的 blank
        Map[] states = {
                new HashMap<Character, Integer>() {{ put(' ', 0); put('s', 1); put('d', 2); put('.', 4); }}, // 0.
                new HashMap<Character, Integer>() {{ put('d', 2); put('.', 4); }},                           // 1.
                new HashMap<Character, Integer>() {{ put('d', 2); put('.', 3); put('e', 5); put(' ', 8); }}, // 2. 对
                new HashMap<Character, Integer>() {{ put('d', 3); put('e', 5); put(' ', 8); }},              // 3. 对
                new HashMap<Character, Integer>() {{ put('d', 3); }},                                        // 4.
                new HashMap<Character, Integer>() {{ put('s', 6); put('d', 7); }},                           // 5.
                new HashMap<Character, Integer>() {{ put('d', 7); }},                                        // 6.
                new HashMap<Character, Integer>() {{ put('d', 7); put(' ', 8); }},                           // 7. 对
                new HashMap<Character, Integer>() {{ put(' ', 8); }}                                         // 8. 对
        };
        // 初始状态
        int p = 0;
        // 字符
        char t;
        for (char c : s.toCharArray()) {
            // 数字
            if (c >= '0' && c <= '9') {
                t = 'd';
            } else if (c == '+' || c == '-') {
                t = 's';
            } else if (c == 'e' || c == 'E') {
                t = 'e';
            } else if (c == '.' || c == ' ') {
                t = c;
            } else {
                t = '?';
            }
            if (!states[p].containsKey(t)) {
                return false;
            }
            p = (int) states[p].get(t);
        }
        return p == 2 || p == 3 || p == 7 || p == 8;
    }
}
