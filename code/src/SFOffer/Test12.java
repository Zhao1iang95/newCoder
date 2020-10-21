package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 矩阵中的路径
 * @create : 2020/09/22 11:11
 */
public class Test12 {
    //请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
    //路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
    //如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
    private final static int[][] next = {{0,-1},{0,1},{-1,0},{1,0}};
    private int rows;
    private int cols;
    public boolean hasPath(char[] matrix,int rows,int cols,char[] str){
        if (rows==0 || cols==0)return false;
        this.rows = rows;
        this.cols = cols;
        //标记矩阵
        boolean[][]marked = new boolean[rows][cols];
        //数组转矩阵
        char[][] array =buildMartix(matrix);

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                //回溯法判断是否包含子字符串
                if (backtracking(array,str,marked,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtracking(char[][] matrix, char[] str, boolean[][] marked, int pathLen, int r, int c) {
        if (pathLen == str.length)return true;
        if (r <0 || r >=rows || c<0 || c >=cols || matrix[r][c]!=str[pathLen] || marked[r][c]){
            return false;
        }
        marked[r][c] = true;
        for (int[] n:next
             ) {
            if (backtracking(matrix,str,marked,pathLen+1,r+n[0],c+n[1])){
                return true;
            }
        }
        marked[r][c] = false;
        return false;
    }

    private char[][] buildMartix(char[] matrix) {
        char[][] array = new char[rows][cols];
        for (int r = 0,idx =0; r <rows ; r++) {
            for (int c = 0; c <cols ; c++) {
                array[r][c] = matrix[idx++];
            }
        }
        return array;
    }
}
