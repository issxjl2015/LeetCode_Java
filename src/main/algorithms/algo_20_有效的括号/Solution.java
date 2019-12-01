package main.algorithms.algo_20_有效的括号;

import java.util.HashMap;
import java.util.Stack;

/**
 * 1、 初始化栈 S。
 * 2、一次处理表达式的每个括号。
 * 3、如果遇到开括号，我们只需将其推到栈上即可。这意味着我们将稍后处理它，让我们简单地转到前面的 子表达式。
 * 4、如果我们遇到一个闭括号，那么我们检查栈顶的元素。如果栈顶的元素是一个 相同类型的 左括号，那么我们将它从栈中弹出并继续处理。否则，这意味着表达式无效。
 * 5、如果到最后我们剩下的栈中仍然有元素，那么这意味着表达式无效。
 *
 * */
public class Solution {

    private HashMap<Character, Character> map;

    // 构造函数
    public Solution() {
        this.map = new HashMap<>();
        this.map.put(')', '(');
        this.map.put('}', '{');
        this.map.put(']', '[');
    }

    public boolean isValid(String s) {
        // 字符串长度为奇数，直接返回false
        if ((s.length() & 1) == 1) {
            return false;
        }
        // 初始化栈
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (this.map.containsKey(c)) {
                char topEle = stack.empty() ? '#' : stack.pop();

                // 如果不能匹配栈顶元素，就直接返回false
                if (topEle != this.map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
