package leetCodeGroup.hash;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 两数之和
 * @create : 2020/08/04 09:11
 */
public class LeetCode1 {
    //给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    //
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
    public int[] towSum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
