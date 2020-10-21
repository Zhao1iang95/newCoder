package SFOffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 和为S的两个数字
 * @create : 2020/10/05 08:28
 */
public class Test57I {
    //输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，
    //输出两个数的乘积最小的。
    public ArrayList<Integer> FindNumbersWithSum(int[] array,int sum){
        //如果两个指针指向元素的和 sum == target，那么得到要求的结果；
        //如果 sum > target，移动较大的元素，使 sum 变小一些；
        //如果 sum < target，移动较小的元素，使 sum 变大一些。
        int i=0,j = array.length-1;
        while(i < j){
            int cur = array[i]+array[j];
            if(cur == sum){
                return new ArrayList<>(Arrays.asList(array[i],array[j]));
            }
            if (cur < sum){
                i++;
            }else {
                j--;
            }
        }
        return new ArrayList<>();
    }
}
