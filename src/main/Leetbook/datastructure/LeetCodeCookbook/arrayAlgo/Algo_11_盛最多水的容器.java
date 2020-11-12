package Leetbook.datastructure.LeetCodeCookbook.arrayAlgo;

public class Algo_11_盛最多水的容器 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int tmp = Math.min(height[l], height[r]) * (r -l);
            ans = Math.max(ans, tmp);
            if (l < r && height[l] >= height[r]) {
                r--;
            } else if (l < r && height[l] < height[r]) {
                l++;
            }
        }
        return ans;
    }
}
