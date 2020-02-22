package main.剑指offer.algo_04_二维数组中的查找;

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int i = row - 1, j = 0;
        boolean flag = false;
        while (i >= 0 && j <= col -1) {
            if (matrix[i][j] == target) {
                flag = true;
                break;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                i--;
            }
        }
        return flag;
    }
}
