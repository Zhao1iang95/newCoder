import java.util.ArrayList;

/**
 * @author zhaoliang
 * @desc 顺时针打印矩阵
 * @date 20200505
 */
public class Main19 {
    //输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
    // 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
    // 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
    public int[] printMatrix(int[][] matrix) {
        if (matrix.length==0 || matrix[0].length==0){
            return new int[0];
        }
        ArrayList<Integer> list = new ArrayList<>();
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (true) {
            //第一行向右逼近
            for (int col = left; col <= right; col++) {
                list.add(matrix[up][col]);
            }
            up++;
            //向下逼近
            if (up > down) {
                break;
            }
            for (int row = up; row <= down; row++) {
                list.add(matrix[row][right]);
            }
            right--;
            //向左逼近
            if (right < left) {
                break;
            }
            for (int col = right; col >= left; col--) {
                list.add(matrix[down][col]);
            }
            down--;
            //向上逼近
            if (down < up) {
                break;
            }
            for (int row = down; row >= up; row--) {
                list.add(matrix[row][left]);
            }
            left++;
            //向右
            if (left > right) {
                break;
            }
        }
        int [] a = new int[matrix.length * matrix[0].length];
        for (int i=0;i<list.size();i++){
            a[i] = list.get(i);
        }
        return a;
    }
}