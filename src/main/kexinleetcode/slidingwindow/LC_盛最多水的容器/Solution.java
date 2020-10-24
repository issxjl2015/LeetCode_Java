package kexinleetcode.slidingwindow.LC_盛最多水的容器;

public class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int l = 0, r = len - 1;
        int ans = -1;
        while (l < r) {
            int tmp = 0;
            if (height[l] >= height[r]) {
                tmp = height[r] * (r - l);
                r--;
            } else {
                tmp = height[l] * (r - l);
                l++;
            }
            ans = Math.max(ans, tmp);
        }
        return ans;
    }
}
