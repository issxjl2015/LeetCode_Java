package main.contest.weekly_contest_176.contest_5343_多次求和构造目标数组;

import java.util.TreeMap;

/**
 * 举个例子：target = [9, 3, 5]
 * target数组是由 [1, 1, 1]计算得到的。
 * 算法如下：
 * 从 [1, 1, 1] 开始
 * [1, 1, 1], 和为 3 ，选择下标 1， target = [1, 1, 3]
 * [1, 3, 1], 和为 5， 选择下标 2，target = [1, 3, 5]
 * [1, 3, 5], 和为 9， 选择下标 0，target = [3, 5, 9]
 * [9, 3, 5] 完成
 *
 * 可以看出来，target数组中的一个数字是由前身和其余两个数字相加的和
 *
 * 那么我们需要反回来计算：
 * 1、计算target数组的和：tat = 17
 * 2、计算 最大值 9 的前身：left = 9 - （17 - 9） = 1
 * 3、target = [1, 3, 5]
 * 4、返回第一步
 *
 * Note：
 * 1、当 target 中最大的值为 1 时，肯定是 true
 * 2、当 计算最大值的前身 < 1 时，肯定是 false
 * 3、每次计算完，记得修改 map 中的值
 */
public class Solution {
    public boolean isPossible(int[] target) {
        int n = target.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += target[i];
            map.put(target[i], map.getOrDefault(target[i], 0) + 1);
        }
        if (sum >= Integer.MAX_VALUE) return false;
        int tat = (int) sum;
        while (true) {
            int biggest = map.lastKey();
            if (biggest == 1) break;
            int left = biggest - (tat - biggest);
            if (left < 1) return false;
            tat -= biggest - left;
            map.put(biggest, map.get(biggest) - 1);
            if (map.get(biggest) == 0) map.remove(biggest);
            map.put(left, map.getOrDefault(left, 0) + 1);
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] target = {9, 3, 5};
        boolean ans = solution.isPossible(target);
        System.out.println(ans);
    }
}
