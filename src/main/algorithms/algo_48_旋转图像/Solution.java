package main.algorithms.algo_48_旋转图像;

public class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[rows - i - 1][j];
                matrix[rows - i - 1][j] = temp;
            }
        }
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                 if (i <= j) {
                     int temp = matrix[i][j];
                     matrix[i][j] = matrix[j][i];
                     matrix[j][i] = temp;
                 }
             }
         }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int [][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
//        int [][] matrix = {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        int [][] matrix = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        solution.rotate(matrix);
        System.out.println("=========");
    }
}
