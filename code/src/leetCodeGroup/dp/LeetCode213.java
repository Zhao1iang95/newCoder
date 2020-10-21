package leetCodeGroup.dp;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 打家劫舍II
 * @create : 2020/09/10 09:04
 */
public class LeetCode213 {
    //你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，
    //这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
    //
    //给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
    public int rob(int[] nums){
        if( nums == null || nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
    private int rob(int[] nums,int start,int end){
        int pre1=0,pre2=0;
        for (int i = start; i <=end ; i++) {
            int cur = Math.max(pre1,pre2+nums[i]);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
}
