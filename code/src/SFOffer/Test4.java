package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二维数组中的查找
 * @create : 2020/09/21 15:26
 */
public class Test4 {
    //在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    // 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    public boolean Find(int target,int[][] array){
        if (array ==null || array.length==0 || array[0].length==0)return false;
        int row = array.length -1;
        int col = array[0].length -1;
        int i = 0;
        int j = col;
        while(i <=row && j >=0){
            if (array[i][j] < target){
                i++;
            }else if (array[i][j] > target){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }
}
