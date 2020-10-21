package SFOffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数组中重复的数字
 * @create : 2020/09/21 08:32
 */
public class Test3 {
    //在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，
    // 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
    public boolean duplicate(int numbers[],int length,int[] duplication){
        //思路：要求时间复杂度 O(N)，空间复杂度 O(1)。因此不能使用排序的方法，也不能使用额外的标记数组。
        //对于这种数组元素在 [0, n-1] 范围内的问题，可以将值为 i 的元素调整到第 i 个位置上进行求解。
        //本题要求找出重复的数字，因此在调整过程中，如果第 i 位置上已经有一个值为 i 的元素，就可以知道 i 值重复。
        //以 (2, 3, 1, 0, 2, 5) 为例，遍历到位置 4 时，该位置上的数为 2，但是第 2 个位置上已经有一个 2 的值了，因此可以知道 2 重复：
        if (numbers==null || length==0){
            return false;
        }
        for (int i = 0; i <length ; i++) {
            while (numbers[i]!=i){
                if (numbers[i] == numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers,i,numbers[i]);
            }
        }
        return false;
    }
    private void  swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
