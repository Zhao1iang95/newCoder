package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最大子序和
 * @create : 2020/06/18 08:23
 */
public class LeetCode53 {
    //给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
    public int maxSubArray(int[] nums) {

        int len = nums.length-1;

        int maxSum = 0;

        int  ans = nums[0];

        for (int i = 0; i <=len ; i++) {
            if (maxSum > 0){
                maxSum += nums[i];
            }else {
                maxSum = nums[i];
            }
            ans = Math.max(ans,maxSum);
        }
        return ans;
    }
}
