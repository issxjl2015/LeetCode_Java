package algorithms.algo_69_x的平方根;

public class Solution2 {
    public int mySqrt(int x) {
        int l = 1;
        int r = x / 2;
        int mid = l + (r - l) / 2;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (mid * mid  > x) {
                r--;
            } else if (mid * mid  == x) {
                return mid;
            } else {
                l++;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int x = 8;
        int ans = solution2.mySqrt(x);
        System.out.println(ans);
    }
}
