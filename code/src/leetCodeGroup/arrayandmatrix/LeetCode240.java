package leetCodeGroup.arrayandmatrix;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 搜索二维矩阵
 * @create : 2020/08/06 10:12
 */
public class LeetCode240 {
    public boolean searchMatrix(int[][] matrix,int target){
        if(matrix==null || matrix.length==0||matrix[0].length==0){
            return false;
        }
        int m = matrix.length,n = matrix[0].length;
        int row =0,col = n-1;
        while (row < m && col>=0 ){
            if (matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target) {
                row++;
            }else {
                col--;
            }
        }
        return false;
    }
}
