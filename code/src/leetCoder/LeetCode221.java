package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最大正方形
 * @create : 2020/07/10 09:22
 */
public class LeetCode221 {
    //在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
    //暴力求解
    public int find_maximalSquare(char[][]matrix){
        int maxSide = 0;
     if (matrix==null || matrix.length==0|| matrix[0].length==0){
         return maxSide;
     }
     int rows = matrix.length;
     int cols = matrix[0].length;
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                if (matrix[i][j]=='1'){
                    maxSide = Math.max(maxSide,1);
                    //计算可能的最大正方形边长
                    int currentMaxSide = Math.min(rows-i,cols-j);
                    for (int k = 1; k <currentMaxSide ; k++) {
                        //判断新增一行一列是否均为1
                        boolean flag = true;
                        if (matrix[i+k][j+k] == '0'){
                            break;
                        }
                        for (int m = 0; m <k ; m++) {
                            if (matrix[i+k][j+m]=='0' || matrix[i+m][j+k]=='0'){
                                flag = false;
                                break;
                            }
                        }
                        if (flag){
                            maxSide = Math.max(maxSide,k+1);
                        }else {
                            break;
                        }
                    }
                }
            }
        }
        return maxSide* maxSide;
    }
    //动态规划
    public int maxiSquare(char [][] matrix){
        int maxSide=0;
        if (matrix==null || matrix.length==0||matrix[0].length==0){
            return maxSide;
        }
        int rows = matrix.length,cols=matrix[0].length;
        int [][]dp=new int[rows][cols];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                if (matrix[i][j] =='1'){
                    if (i==0 || j==0){
                        dp[i][j]=1;
                    }else {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    }
                    maxSide = Math.max(maxSide,dp[i][j]);
                }
            }
        }
        return maxSide*maxSide;
    }
}
