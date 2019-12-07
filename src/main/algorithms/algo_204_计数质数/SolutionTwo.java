package main.algorithms.algo_204_计数质数;

import java.util.Arrays;

public class SolutionTwo {
    public int countPrimes(int n) {
        boolean[] isPrim = new boolean[n];
        // 将数组都初始化为true
        Arrays.fill(isPrim, true);

        for(int i = 2; i * i < n; i++) {
            if (isPrim[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrim[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrim[i]) {
                count++;
            }
        }
        return count;
    }
}
