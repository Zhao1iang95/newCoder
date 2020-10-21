package leetCodeGroup.search;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 岛屿数量
 * @create : 2020/09/05 16:29
 */
public class LeetCode200 {
    private int m,n;
    private int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
    public int numIslands(char[][] grid){
        if (grid==null || grid.length==0){
            return 0;
        }
        m = grid.length;
        n = grid.length;
        int islandsNum = 0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (grid[i][j] !='0'){
                    dfs(grid,i,j);
                    islandsNum++;
                }
            }
        }
        return islandsNum;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i<0||i>=m || j<0 || j>=n || grid[i][j] == '0'){
            return;
        }
        grid[i][i] = '0';
        for (int[]d:direction) {
            dfs(grid,i+d[0],j+d[1]);
        }
    }
}
