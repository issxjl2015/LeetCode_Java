package main.weeklyContest.weekly_contest_177.contest_5172_形成三的最大倍数;

import java.util.*;

/**
 * 算法：
 * 1、将digits中数字取余为0,1,2的放在不同的列表中
 * 2、将数字之和对3取余，取余后的数字为0，则可以直接返回
 * 3、取余后的数字为1，则在余数为1的列表中去掉 1个最小的数，或者在余数为2的数组中去掉 2个最小的数
 * 4、取余后的数字为2，则在取余的余数为 1的数组中去掉 2个最小的两个数，或者在余数为 2的数组中去掉一个最小的数
 * 5、处理完后，将三个数组整合到一起，从高到低排序后转成字符输出
 * 注意：尽量优先去掉一个，再考虑去掉两个，因为去掉一个结果就少一位，题干中要求的是最大的。
 */
public class Solution {
    public String largestMultipleOfThree(int[] digits) {
        List<Integer>[] res = new List[3];
        for (int i = 0; i < 3; i++) {
            res[i] = new ArrayList<>();
        }
        int sum = 0;

        // 求和
        for (int i : digits) {
            res[i % 3].add(i);
            sum += i;
        }
        // 排序
        for (int i = 0; i < 3; i++) {
            Collections.sort(res[i], Collections.reverseOrder());
        }
        int flag = sum % 3;
        // 分情况讨论
        if (flag != 0) {
            if (res[flag].size() > 0) {
                res[flag].remove(res[flag].size() - 1);
            } else if (res[3 - flag].size() > 1) {
                res[3 - flag].remove(res[3 - flag].size() - 1);
                res[3 - flag].remove(res[3 - flag].size() - 1);
            } else {
                res[1].clear();
                res[2].clear();
            }
        }
        // 合并求最后的结果
        res[0].addAll(res[1]);
        res[0].addAll(res[2]);
        Collections.sort(res[0], Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i : res[0]) {
            sb.append(i);
        }
        // 前导零
        if (sb.length() != 0 && sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.largestMultipleOfThree(new int[] {8, 1, 6, 3, 9});
        System.out.println(ans);
    }
}
