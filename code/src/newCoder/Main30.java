/**
 * @desc 连续子数组的最大和
 * @author zhaoliang
 * date 20200519
 */
public class Main30 {
    //输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
    //要求时间复杂度为O(n)
    //动态规划
    public int maxSubArray(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int maxSum=nums[0];
        for (int i=1;i<nums.length;i++){
           nums[i]+=Math.max(nums[i-1],0);
           maxSum = Math.max(maxSum,nums[i]);
        }
        return maxSum;
    }
}
