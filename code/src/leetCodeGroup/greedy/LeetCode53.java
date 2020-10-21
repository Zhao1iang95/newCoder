package leetCodeGroup.greedy;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最大子序和
 * @create : 2020/08/21 10:18
 */
public class LeetCode53 {
    //给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
    public int maxSubArray(int[] nums){
        if(nums==null || nums.length==0)return 0;
        int preSum = nums[0];
        int maxSum = preSum;
        for (int i = 1; i <nums.length ; i++) {
            preSum = preSum<0?nums[i]:preSum+nums[i];
            maxSum = Math.max(maxSum,preSum);
        }
        return maxSum;
    }
}
