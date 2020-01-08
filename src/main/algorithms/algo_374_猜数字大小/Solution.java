package main.algorithms.algo_374_猜数字大小;

public class Solution extends GuessGame{
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res < 0) {
                right = mid - 1;
            } else if (res > 0) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
