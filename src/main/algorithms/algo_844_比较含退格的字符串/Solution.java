package main.algorithms.algo_844_比较含退格的字符串;

import java.util.Stack;

public class Solution {
    public boolean backspaceCompare(String S, String T) {
        char[] sArr = S.toCharArray();
        char[] tArr = T.toCharArray();
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for (Character s : sArr) {
            if (s.equals('#')) {
                if (!sStack.empty()) {
                    sStack.pop();
                }
            } else{
                sStack.push(s);
            }
        }
        for (Character s : tArr) {
            if (s.equals('#')) {
                if (!tStack.empty()) {
                    tStack.pop();
                }
            } else{
                tStack.push(s);
            }
        }
        String sStr = sStack.toString();
        String tStr = tStack.toString();
        if (sStr.equals(tStr)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        "y#fo##f"
//        "y#f#o##f"

//        "a##c"
//        "#a#c"
        boolean flag = solution.backspaceCompare("a##c", "#a#c");
        System.out.println(flag);
    }
}
