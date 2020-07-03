import java.util.ArrayList;

/**
 * @desc 和为s的两个数
 * @author zhaoliang
 * @date 20200418
 */
public class Main57 {
    //输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
    // 如果有多对数字的和等于S，输出两个数的乘积最小的。
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        ArrayList<Integer> list =new ArrayList<>();
        int ahead = 0;
        int behind = array.length - 1;
        while (ahead <=behind){
            if (array[ahead] + array[behind] == sum){
                list.add(array[ahead]);
                list.add(array[behind]);
                break;
            }else if(array[ahead] + array[behind] < sum ){
                ahead ++;
            }else {
                behind --;
            }
        }
        return list;
    }
}
