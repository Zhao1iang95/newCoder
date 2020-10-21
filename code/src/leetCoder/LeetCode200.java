package leetCoder;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 岛屿数量
 * @create : 2020/07/08 06:48
 */
public class LeetCode200 {
    public int numIslands(char[][] grid){
        if (grid==null || grid.length ==0){
            return 0;
        }
        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int i = 0; i <nr ; i++) {
            for (int j = 0; j <nc ; j++) {
                if (grid[i][j] == '1'){
                    ++num_islands;
                    dfs(grid,i,j);
                }
            }
        }
        return num_islands;

    }
    //深度优先
    private void dfs(char[][] grid, int i, int j) {
        int nr = grid.length;
        int nc = grid[0].length;
        if (i <0 || j <0 || i >=nr || j >= nc || grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
//广度优先
public int numsIslands1(char[][] grid){
        if (grid==null || grid.length==0){
            return 0;
        }
        int nr = grid.length;
        int nc = grid[0].length;
        int is_nums =0;
    for (int i = 0; i <nr ; i++) {
        for (int j = 0; j <nc ; j++) {
            if (grid[i][j] == '1'){
                ++is_nums;
                grid[i][j] ='0';
                Queue<Integer> neighbors = new LinkedList<>();
                neighbors.add(i*nc + j);
                while (!neighbors.isEmpty()){
                    int id = neighbors.remove();
                    int row = id/nc;
                    int col = id % nc;
                    if (row - 1>=0&& grid[row-1][col] == '1'){
                        neighbors.add((row-1)*nc + col);
                        grid[row-1][col] = '0';
                    }
                    if (row+1 < nr && grid[row+1][col] == '1'){
                        neighbors.add((row+1)*nc+col);
                        grid[row+1][col] = '0';
                    }
                    if (col-1 >=0 && grid[row][col-1] == '1'){
                        neighbors.add(row * nc + col-1);
                        grid[row][col-1] = '0';
                    }
                    if (col + 1 < nc && grid[row][col+1] =='1'){
                        neighbors.add(row*nc + col+1);
                            grid[row][col+1] = '0';
                        }
                }
            }

        }
    }
    return is_nums;
}
}
