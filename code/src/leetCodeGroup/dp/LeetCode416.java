package leetCodeGroup.dp;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 分割等和子集
 * @create : 2020/09/16 09:14
 */
public class LeetCode416 {
    //给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
    public boolean canPartition(int[] nums){
        //可以看成一个背包大小为 sum/2 的 0-1 背包问题。
        int sum = computerArraySum(nums);
        if (sum%2!=0){
            return false;
        }
        int W = sum/2;
        boolean[] dp = new boolean[W+1];
        dp[0] = true;
        for (int num:nums//0-1背包一个物品只能用一次
             ) {
            for (int i = W; i >=num ; i--) { //从后往前，先计算dp[i]再计算dp[i-num]
                dp[i] = dp[i] || dp[i-num];
            }
        }
        return dp[W];
    }

    private int computerArraySum(int[] nums) {
        int sum =0;
        for (int num:nums
             ) {
            sum+=num;
        }
        return sum;
    }
}
