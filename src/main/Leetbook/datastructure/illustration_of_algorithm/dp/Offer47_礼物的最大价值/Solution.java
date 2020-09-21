package Leetbook.datastructure.illustration_of_algorithm.dp.Offer47_礼物的最大价值;

public class Solution {
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int i = 0, j = 0;
        int ans = grid[0][0];
        while (i < row && j < col) {
            if (i + 1 < row && j + 1 < col) {
                ans += Math.max(grid[i + 1][j], grid[i][j + 1]);
                if (grid[i + 1][j] > grid[i][j + 1]) {
                    System.out.println("下面的大" + grid[i+1][j]);
                    i++;
                } else {
                    System.out.println("右边的大" + grid[i][j+1]);
                    j++;
                }
            }
            if (j == col - 1) {
                while (i < row) {
                    System.out.println("达到了最右边，只能往下走" + grid[i][j]);
                    ans += grid[i++][j];
                }
                break;
            } else {
                while (j < col) {
                    System.out.println("达到了最下面，只能往右走" + grid[i][j]);
                    ans += grid[i][j++];
                }
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = new int[][] {{1,3,1},{1,5,1},{4,2,1}};
        int ans = solution.maxValue(arr);
        System.out.println(ans);
    }
}
