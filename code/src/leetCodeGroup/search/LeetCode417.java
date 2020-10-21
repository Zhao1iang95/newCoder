package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 太平洋大西洋水流问题
 * @create : 2020/09/06 10:52
 */

public class LeetCode417 {
    //给定一个 m x n 的非负整数矩阵来表示一片大陆上各个单元格的高度。
    //“太平洋”处于大陆的左边界和上边界，而“大西洋”处于大陆的右边界和下边界。
    //规定水流只能按照上、下、左、右四个方向流动，且只能从高到低或者在同等高度上流动。
    private int m,n;
    private int[][] matrix;
    private int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] matrix){
        List<List<Integer>> res = new ArrayList<>();
        if (matrix==null || matrix.length==0){
            return res;
        }
        m = matrix.length;
        n = matrix[0].length;
        this.matrix = matrix;
        boolean [][] canReachP = new boolean[m][n];
        boolean [][] canReachA = new boolean[m][n];
        for (int i = 0; i <m ; i++) {
            dfs(i,0,canReachP);
            dfs(i,n-1,canReachA);
        }
        for (int i = 0; i <n ; i++) {
            dfs(0,i,canReachP);
            dfs(m-1,i,canReachA);
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (canReachP[i][j] && canReachA[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }

    private void dfs(int r, int c, boolean[][] canReach) {
        if (canReach[r][c]){
            return;
        }
        canReach[r][c] = true;
        for (int[] d:direction
             ) {
            int nextR = d[0]+r;
            int nextC = d[1]+c;
            if (nextR<0 || nextR>=m || nextC<0 || nextC>=n || matrix[r][c] > matrix[nextR][nextC]){
                continue;
            }
            dfs(nextR,nextC,canReach);
        }
    }

}
