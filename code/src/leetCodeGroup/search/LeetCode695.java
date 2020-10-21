package leetCodeGroup.search;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 岛屿的最大面积
 * @create : 2020/09/05 16:10
 */
public class LeetCode695 {
    private int m,n;
    private int[][] direction ={{0,1},{0,-1},{1,0},{-1,0}};
    public int maxAreaOfIsland(int[][] grid){
        if (grid==null || grid.length == 0){
            return 0;
        }
        m = grid.length;
        n = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                maxArea = Math.max(maxArea,dfs(grid,i,j));
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int r, int c) {
        if (r <0 || r>=m || c <0 ||c>=n || grid[r][c]== 0 ){
            return 0;
        }
        grid[r][c] = 0;
        int area = 1;
        for (int[] d:direction) {
            area +=dfs(grid,r+d[0],c+d[1]);
        }
        return area;
    }
}
