/**
 * @desc 数组中数值和下标相等的元素
 * @author zhaoliang
 * @date 20200416
 */

public class Main53_3 {
    //  数组中数值和下标相等的元素
    public static int findNum(int[] array){
        if (array.length == 0){
            return -1;
        }
       int l = 0;
       int r = array.length-1;
       while (l < r){
           int mid = (l + r) >> 1;

           if (mid == array[mid]){
               return mid;
           }
           if (mid < array[mid]){
               if (mid == 0){
                   return -1;
               }
               r = mid -1;
           }else if(mid > array[mid]){
               if (mid == array.length-1){
                   return -1;
               }
               l = mid +1;
           }
       }
       if (l == array[l]){
           return l;
       }
       return -1;
    }

}
