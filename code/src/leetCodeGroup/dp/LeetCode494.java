package leetCodeGroup.dp;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 目标和
 * @create : 2020/09/16 10:10
 */
public class LeetCode494 {
    //给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 + 和 -。
    //对于数组中的任意一个整数，你都可以从 + 或 -中选择一个符号添加在前面。
    //返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
    public int findTargetSumWays(int[] nums,int S){
        //将数组看成两部分，P和N，其中P使用正号，N使用负号
        //Sum(P)-Sum(N) = S
        //Sum(P)+Sum(N) + Sum(P) -Sum(N) = S + Sum(P)+Sum(N)
        //2 * Sum(P) = S + Sum(nums)
        //因此只需要找到一个子集，使得，Sum(P) = (S+Sum(nums))/2
        int sum = computerArraysSum(nums);
        if (sum <S || (sum+S) % 2==1){
            return 0;
        }
        int W = (sum+S)/2;
        int [] dp = new int[W+1];
        dp[0]=1;
        for (int num:nums
             ) {
            for (int i = W; i >=num ; i--) {
                dp[i] = dp[i]+dp[i-num];
            }
        }
        return dp[W];
    }

    private int computerArraysSum(int[] nums) {
        int sum =0;
        for (int num:nums
             ) {
            sum+=num;
        }
        return sum;
    }
}
