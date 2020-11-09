package algorithms.algo_1356_根据数字二进制下1的数目排序;

import java.util.Arrays;

/**
 * 执行用时：
 * 3 ms
 * , 在所有 Java 提交中击败了
 * 99.82%
 * 的用户
 * 内存消耗：
 * 38.3 MB
 * , 在所有 Java 提交中击败了
 * 99.75%
 * 的用户
 */
public class Solution2 {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 100000;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 100000;
        }
        return arr;
    }
}
