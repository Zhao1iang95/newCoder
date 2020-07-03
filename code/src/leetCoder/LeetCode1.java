package leetCoder;

import java.util.HashMap;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 两数之和
 * @create : 2020/05/27 09:28
 */
public class LeetCode1 {
    //给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    //
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
    //哈希
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] res = new int[2];
        for (int i = 0; i <nums.length ; i++) {
            int  temp = target - nums[i];
            if (map.containsKey(temp)){
                res[0] = map.get(temp);
                res[1] = i;
            }
            map.put(nums[i],i);
        }

        return res;
    }
    //暴力法
    public int[] twoSum2(int[] nums, int target){
        int [] res = new int[2];
        for (int i = 0; i <nums.length ; i++) {

            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] =j;
                    break;
                }
            }
        }
        return res;
    }
 }
