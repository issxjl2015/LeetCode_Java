package main.algorithms.algo_784_字母大小写全排列;

import java.util.ArrayList;
import java.util.List;

/***
 * 大小写字母切换:s[i]^=(1<<5);——骚操作
 * 大小写字母相差32,又因为异或重要特性:不进位加法,所以大写字母和(1<<5)异或变成变成小写字母,小写字母和(1<<5)异或变成大写字母。
 * 思路:递归排列组合出所有可能,利用异或运算转换字母大小写。
 *
 */
public class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<String>();
        dg(S.toCharArray(), 0, ans);
        return ans;
    }

    public void dg(char[] s, int i, List<String> ans) {
        if (i == s.length) {
            ans.add(String.valueOf(s));
            return;
        }
        dg(s, i + 1, ans);
        if (s[i] < '0' || s[i] > '9') {
            s[i] ^= (1 << 5);
            dg(s, i + 1, ans);
        }
    }
}
