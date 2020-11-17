package algorithms.algo_739_每日温度;

import java.util.Stack;

public class Solution2 {
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = T.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && T[stack.peek()] <= T[i]) {
                stack.pop();
            }
            ans[i] = stack.empty() ? 0 : (stack.peek() - i);
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] T = {73, 74, 75, 71, 69, 72, 76};
        int[] ans = solution2.dailyTemperatures(T);
        System.out.println(ans);
    }
}
