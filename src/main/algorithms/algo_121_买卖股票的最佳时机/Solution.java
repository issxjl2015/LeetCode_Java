package main.algorithms.algo_121_买卖股票的最佳时机;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 0) {
            return 0;
        }
        int low = prices[0];
        int high = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < low) {
                // 只有最大的才可以作为max
                if(max < high - low) {
                    max = high - low;
                }
                low = prices[i];
                high = prices[i];
            }
            if (prices[i] > high) {
                high = prices[i];
            }
        }
        return max > (high - low) ? max : (high - low);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = {7, 1, 5, 3, 6, 4};
//        int[] arr = {2, 4, 1};
        int[] arr = {4, 7, 2, 1};
        int max = solution.maxProfit(arr);
        System.out.println(max);
    }
}
