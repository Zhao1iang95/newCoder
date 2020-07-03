/**
 * @desc 0～n-1中缺失的数字
 * @author zhaoliang
 * @date 20200416
 */

public class Main53_2 {
    //  找出0～n-1中缺失的数字。一个长度为n-1的递增排序数组中的所有数字都是唯一的，
    //  并且每个数字都在范围0-n-1之内。在范围0-n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
    public static int findLostNum(int[] array){

        if (array.length == 0){
            return -1;
        }
        int len = array.length;
        int start = 0;
        int end =len-1;
        while (start <= end){
            int mid = (start + end)>>1;
            if (array[mid] == mid){
                start = mid +1 ;
            }else {
               if (mid > 0 && array[mid - 1] == (mid - 1) || mid == 0){
                   return mid;
               }else {
                   end = mid - 1 ;
               }
            }
        }
        return -1;
    }

}
