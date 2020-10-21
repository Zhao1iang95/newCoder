package leetCodeGroup.dp;

import java.util.Arrays;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 组合总和IV
 * @create : 2020/09/17 10:19
 */
public class LeetCode377 {
    //给定一个由正整数组成且不存在重复数字的数组，找出和为给定目标正整数的组合的个数。
    public int combinationSum4(int[] nums,int target){
        if (nums==null || nums.length==0)return 0;
        int[] maximum = new int[target+1];
        maximum[0]=1;
        Arrays.sort(nums);
        for (int i = 0; i <=target ; i++) {
            for (int j = 0; j <nums.length && nums[j]<=i ; j++) {
                maximum[i]+=maximum[i-nums[j]];
            }
        }
        return maximum[target];
    }
}
