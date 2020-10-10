package Leetbook.datastructure.illustration_of_algorithm.doublepointer.Offer58_I_翻转单词顺序;


public class Solution {

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String[] ss = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = ss.length - 1; i >= 0; i--) {
            if (ss[i].equals("")) {
                continue;
            }
            sb.append(ss[i] + " ");
        }
        // 此处优化了之前的写法，之前的写法是用substringd来去除空格
        return sb.toString().trim(); // 转化为字符串后 删除尾部空格，并返回
    }
}
