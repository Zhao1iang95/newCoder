package leetCodeGroup.arrayandmatrix;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 托普里茨矩阵
 * @create : 2020/08/07 14:41
 */
public class LeetCode766 {
    //如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
    //
    //给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
    public boolean isToeplitzMatrix(int[][] matrix){
        for (int i = 0; i <matrix[0].length ; i++) {
            if(!check(matrix,matrix[0][i],0,i)){
                return false;
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            if(!check(matrix,matrix[i][0],i,0)){
                return false;
            }
        }
        return true;
    }

    private boolean check(int[][] matrix, int target, int row, int col) {
        if(row>=matrix.length || col>=matrix[0].length){
            return true;
        }
        if(matrix[row][col]!=target){
            return false;
        }
        return check(matrix,target,row+1,col+1);
    }

}
