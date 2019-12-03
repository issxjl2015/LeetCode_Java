package main.algorithms.algo_392_判断子序列;

import java.util.Stack;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) {
            return false;
        }
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for (char c : sch) {
            sStack.push(c);
        }
        for (char c : tch) {
            tStack.push(c);
        }
        // 用栈的思想来实现
        while (tStack.size() > 0) {
            char c = tStack.pop();
            if (c == sStack.get(sStack.size() - 1)) {
                sStack.pop();
                if (sStack.size() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
