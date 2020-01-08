package main.algorithms.algo_374_猜数字大小;

public class GuessGame {
    public int guess(int input) {
        if (input < 6) {
            return -1;
        } else if (input == 6) {
            return 0;
        } else {
            return 1;
        }
    }
}
