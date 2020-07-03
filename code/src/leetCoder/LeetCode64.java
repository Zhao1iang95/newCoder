package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最小路径和
 * @create : 2020/06/21 09:26
 */
public class LeetCode64 {
    //给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
    //
    //说明：每次只能向下或者向右移动一步。
    public int minPathSum(int[][] grid) {
        for (int row = 0; row <grid.length ; row++) {//行
            for (int col = 0; col <grid[0].length ; col++) {//列
                if (row == 0 && col==0){//第一行第一列跳过
                    continue;
                }else if (row==0){//第一行，路径和等于当前值加列-1
                    grid[row][col] = grid[row][col-1] + grid[row][col];
                }else if (col==0){//第一列，路径和等于当前值+行-1
                    grid[row][col] = grid[row-1][col] + grid[row][col];
                }else {//比较前一行的值，和前一列的值，取最小
                    grid[row][col] = Math.min(grid[row-1][col],grid[row][col-1])+grid[row][col];
                }

            }
        }
        return grid[grid.length-1][grid[0].length-1];//在当前数组做的值变换
    }
}
