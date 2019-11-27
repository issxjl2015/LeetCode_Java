package main.algorithms.algo_93_复原IP地址;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * ip地址的特点: 必须是三个点, 分割出四段. 每段都在[0,255]之间.
 *
 * 字符串s转成ip地址的要求:
 *
 * s中的字符在ip串中不能少.
 * ip中必须有三个点, 四个段.
 * 每个段最少一个字符, 最多三个字符, 且段值在[0,255]
 * 字符’0’只能单独成段.
 *
 * */
public class Solution {
    // cur : 当前答案，以 String List的形式，最后再join成String形式 例如 [[255],[255],[111],[35]] -> 255.255.111.35
    // pos, 当前扫描到的s的位置， ans最终答案
    private void backtracking(String s, int pos, List<String> cur,  List<String> ans) {
        if (cur.size() >= 4) {
            if (pos == s.length()) ans.add(String.join(".", cur));
            return;
        }
        // 分割得到ip地址的一段后，下一段只能在长度1-3范围内选择
        for (int i = 1; i <= 3; i++) {
            if (pos+i > s.length()) {
                break;
            }
            String segment = s.substring(pos, pos+i);
            // 剪枝条件：不能以0开头，不能大于255
            if (segment.startsWith("0") && segment.length() > 1 || (i == 3 && Integer.parseInt(segment) > 255)) continue;
            cur.add(segment);
            // 注意此处传的参数
            backtracking(s, pos+i, cur, ans);
            cur.remove(cur.size()-1);
        }
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        backtracking(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> rst = solution.restoreIpAddresses("25525511135");
        for (int i = 0; i < rst.size(); i++) {
            System.out.println(rst.get(i));
        }
    }
}
