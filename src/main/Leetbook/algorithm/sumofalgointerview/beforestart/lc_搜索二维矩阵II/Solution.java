package Leetbook.algorithm.sumofalgointerview.beforestart.lc_搜索二维矩阵II;

/**
 * 题目：搜索二维矩阵II
 * 思路：每行元素从左到右升序，每列元素从上到下升序。
 *      那么，可以从左下角或者右下角开始遍历。
 *      1、左小角开始遍历：往上看，都比当前值更小；往右看，都比当前值更大。
 *      2、右上角开始遍历：往下看，都比当前值更大；往左看，都比当前值更小。
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length, col = matrix[0].length;
        int i = row - 1, j = 0;
        while (i >= 0 && j < col) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
         }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][] {};
        int target = 0;
        boolean ans = solution.searchMatrix(matrix, target);
        System.out.println(ans);
    }
}
