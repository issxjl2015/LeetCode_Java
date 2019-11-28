package main.algorithms.algo_300_最长上升子序列;

/**
 * 在给定数组中最长上升子序列可能达到 i^{th}i
 * th
 *   独立于后面在数组中出现的元素。因此，如果我们知道 lis 的长度不超过 i^{th}i
 * th
 *   ，我们可以根据索引为 jj 的元素包括 (i+1)^{th}(i+1)
 * th
 *   元素来计算 lis 的长度，其中 0\leq j\leq（i+1）0≤j≤（i+1）。
 *
 * 我们使用 dpdp 数组来存储所需的数据。 dp[i]dp[i] 表示考虑到数组元素一直到 i^{th}i
 * th
 *   的情况下可能的最长上升子序列的长度，必须包括 i^{th}i
 * th
 *   元素。为了找出 dp[i]dp[i]，我们需要尝试在每个可能的最长上升子序列中附加当前元素（nums[i]nums[i]）到 (i-1)^{th}(i−1)
 * th
 *  （包括 (i-1)^{th}(i−1)
 * th
 *  ），这样通过添加当前元素形成的新序列也是一个上升子序列。因此，我们可以很容易地确定 dp[i]dp[i] 使用：
 *
 * dp[i] = \text{max}(dp[j]) + 1, \forall 0\leq j < idp[i]=max(dp[j])+1,∀0≤j<i
 *
 * 最后，确定最终结果的所有 dp[i]dp[i] 中的最大值。
 *
 * LIS_{length}= \text{max}(dp[i]), \forall 0\leq i < nLIS
 * length
 * ​
 *  =max(dp[i]),∀0≤i<n
 *
 * */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = solution.lengthOfLIS(arr);
        System.out.println(result);
    }
}
