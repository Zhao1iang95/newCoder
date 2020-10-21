package leetCodeGroup.dp;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 打家劫舍
 * @create : 2020/09/10 08:58
 */
public class LeetCode198 {
    //你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
    // 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
    //
    //给定一个代表每个房屋存放金额的非负整数数组，计算你不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
    public int rob(int[] nums){
        //定义 dp 数组用来存储最大的抢劫量，其中 dp[i] 表示抢到第 i 个住户时的最大抢劫量。
        //
        //由于不能抢劫邻近住户，如果抢劫了第 i -1 个住户，那么就不能再抢劫第 i 个住户，所以
            //dp[i] = max(dp[i-2]+dp[i],dp[i-1])
        int pre1 =0,pre2=0;
        for (int i = 0; i <nums.length ; i++) {
            int cur = Math.max(pre2+nums[i],pre1);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
}
