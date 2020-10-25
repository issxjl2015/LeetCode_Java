package algorithms.Algo_845_数组中的最长山脉;

public class Solution2 {
    public int longestMountain(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }

        // 当前长度
        int curLen = 1;
        // 最大长度
        int maxLen = 0;
        // 标识，true 上升期， false 下降期
        boolean upFlag = true;
        for (int i = 1; i < A.length; i++) {
            // 当前处于 上升期
            if (A[i] > A[i -1] && upFlag) {
                curLen++;
            } else if (A[i] < A[i - 1] && curLen > 1) {
                // 当前处于下降期
                upFlag = false;
                curLen++;
                maxLen = Math.max(curLen, maxLen);
            } else {
                // 当前山脉存在，但是A[i]不合符要求，所以A[i]应该是下一个山脉的元素
                if (!upFlag) {
                    i--; // 指针前移，便于判断下一个山脉时，第一个判断当前元素
                }
                // 重置 upFlag 和 curLen
                upFlag = true;
                curLen = 1;
            }
        }
        // 确保山脉的长度至少大于3
        return maxLen < 3 ? 0 : maxLen;
    }
}
