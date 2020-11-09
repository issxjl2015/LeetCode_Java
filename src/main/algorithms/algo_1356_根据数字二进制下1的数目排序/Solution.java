package algorithms.algo_1356_根据数字二进制下1的数目排序;

import java.util.Arrays;

public class Solution {
    public int[] sortByBits(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // 高位存放bit为1的数量，低位存放原始值
            newArr[i] = computeOne(arr[i]) * 100000 + arr[i];
        }
        Arrays.sort(newArr);
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = newArr[i] % 100000;
        }
        return newArr;
    }

    // 计算bit为1的数量
    private int computeOne(int x) {
        int cnt = 0;
        while (x != 0) {
            if ((x & 1) != 0) {
                cnt++;
            }
            x = x >>> 1;
        }
        return cnt;
    }
}
