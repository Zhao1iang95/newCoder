package leetCodeGroup.search;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 被围绕的矩阵
 * @create : 2020/09/06 10:34
 */
public class LeetCode130 {
    //给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
    //
    //找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
    private int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
    private int m,n;
    public void solve(char[][] board) {
        if (board==null || board.length==0){
            return;
        }
        m = board.length;
        n = board[0].length;
        for (int i = 0; i <m ; i++) {
            dfs(board,i,0);
            dfs(board,i,n-1);
        }
        for (int i = 0; i <n ; i++) {
            dfs(board,0,i);
            dfs(board,m-1,i);
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (board[i][j]=='T'){
                    board[i][j] ='O';
                }else if (board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }

    private void dfs(char[][] board, int r, int c) {
        if (r<0 || r>=m || c <0 || c>=n || board[r][c] != 'O'){
            return;
        }
        board[r][c] = 'T';
        for (int[] d: direction) {
            dfs(board,r+d[0],c+d[1]);
        }
    }
}
