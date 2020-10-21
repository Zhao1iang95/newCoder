package leetCodeGroup.dp;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 零钱兑换
 * @create : 2020/09/16 11:00
 */
public class LeetCode322 {
    //给定不同面额的硬币 coins 和一个总金额 amount。
    // 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
    public int coinChange(int[] coins,int amount){
        int[] dp = new int[amount+1];
        for (int coin:coins) {
            for (int i = coin; i <=amount ; i++) { //将逆序遍历改为正序遍历
                if (i==coin){
                    dp[i] =1;
                }else if (dp[i]==0 && dp[i-coin] !=0){
                    dp[i] = dp[i-coin]+1;
                }else if(dp[i-coin]!=0){
                    dp[i] = Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        return dp[amount] ==0?-1:dp[amount];
    }
}
