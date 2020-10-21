package leetCodeGroup.dp;

import java.util.Arrays;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 不同路径
 * @create : 2020/09/10 09:39
 */
public class LeetCode62 {
    //一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
    //
    //机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
    //
    //问总共有多少条不同的路径？
    public int uniquePaths(int m,int n){
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                dp[j] = dp[j] + dp[j-1];
            }
        }
        return dp[n-1];
    }
}
