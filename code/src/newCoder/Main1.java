/**
 * @author zhaoliang
 * @desc 二维数组的查找
 * @date 20200427
 */
public class Main1 {
    //在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
    // 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    //方法一暴力遍历
    public boolean Find1(int target, int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    //方法二：根据数组特点
    public boolean Find2(int target, int[][] array) {
        boolean find = false;

        if (array == null || array.length == 0 || array[0] == null || array[0].length == 0) {
            return find;
        }

        int row = 0;

        int col = array[0].length - 1;

        while (row < array.length && col >= 0) {

            if (target == array[row][col]) {
                find = true;
                break;
            } else if (array[row][col] > target) {
                --col;
            } else {
                row++;
            }
        }
        return find;
    }
}
