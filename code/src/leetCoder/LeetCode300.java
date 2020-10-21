package leetCoder;

import java.util.Arrays;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最长上升子序列
 * @create : 2020/07/16 09:11
 */
public class LeetCode300 {
    //给定一个无序的整数数组，找到其中最长上升子序列的长度
    //动态规划
    public int lengthOfLIS(int[] nums){
        int len = nums.length;
        if (len==0)return 0;
        int res = 0;
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <i ; j++) {
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(dp[i],res);
        }
        return res;
    }
}
