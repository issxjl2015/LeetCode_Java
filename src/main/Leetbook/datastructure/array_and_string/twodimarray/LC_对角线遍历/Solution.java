package Leetbook.datastructure.array_and_string.twodimarray.LC_对角线遍历;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[] {};
        }
        int row = matrix.length, col = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[matrix.length * matrix[0].length];
        int cnt = 0;
        int index = 0;
        for (int k = 0; k <= col;) {
            index++;
            int iii = k;
            int tmpCol = iii == col ? --k : k;
            int tmpRow = iii == col ? ++cnt : 0;
            List<Integer> list1 = new ArrayList<>();
            while (tmpRow < row && tmpCol >= 0) {
                list1.add(matrix[tmpRow++][tmpCol--]);
            }
            if (index % 2 == 1) {
                for (int ii = list1.size() - 1; ii >= 0; ii--) {
                    list.add(list1.get(ii));
                }
            } else {
                list.addAll(list1);
            }
            if (k != col) {
                k++;
            }
            if (index > (col + row - 1)) {
                break;
            }
        }
        for (int i = 0; i < row * col; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        int[] ans = solution.findDiagonalOrder(matrix);
        System.out.println(ans);
    }
}
