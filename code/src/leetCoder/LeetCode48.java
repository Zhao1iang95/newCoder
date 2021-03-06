package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 旋转图像
 * @create : 2020/06/17 08:55
 */
public class LeetCode48 {
    /**
     * 给定一个 n × n 的二维矩阵表示一个图像。
     * 将图像顺时针旋转 90 度。
     * 说明：
     * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        if (matrix == null){
            return;
        }
        int len = matrix.length;
        if (len <=1){
            return;
        }
        int temp = 0;
        for (int i = 0; i <len/2 ; i++) {
            for (int j = i; j <len-i-1 ; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[len-j-1][i];
                matrix[len-j-1][i] = matrix[len-i-1][len-j-1];
                matrix[len-i-1][len-j-1] = matrix[j][len-i-1];
                matrix[j][len-i-1] = temp;
            }
        }
    }
}
