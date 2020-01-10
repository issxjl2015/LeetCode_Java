package main.algorithms.algo_875_爱吃香蕉的珂珂;

public class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        Arrays.sort(piles);
        int len = piles.length;
        int left = 1;
        int right = 1000000000;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int costTime = eatBanana(piles, mid);
            if (costTime <= H) {
                right = mid;
            } else  {
                left = mid + 1;
            }
        }
        return left;
    }

    private int eatBanana(int[] piles, int mid) {
        int ans = 0;
        for (int i : piles) {
            ans += i / mid + (i % mid != 0 ? 1 : 0);
        }
        return ans;
    }
}
