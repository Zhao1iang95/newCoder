/**
 * @desc 礼物的最大价值
 * @author zhaoliang
 * @date 20200413
 */
public class Main47 {
        private static int getMaxValue1(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;
            for (int i = 1; i < row; ++i) {
                grid[i][0] += grid[i - 1][0];
            }
            //初始化数组
            for (int j = 1; j < col; ++j) {
                grid[0][j] += grid[0][j - 1];
            }

            for (int i = 1; i < row; ++i) {
                for (int j = 1; j < col; ++j) {
                    //可以选择是左边的还是上边的走到这一步
                    grid[i][j] +=Math.max(grid[i - 1][j], grid[i][j - 1]);
                }
            }
            return grid[row - 1][col - 1];
        }

}
