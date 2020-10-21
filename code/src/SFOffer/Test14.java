package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 剪绳子
 * @create : 2020/09/23 09:05
 */
public class Test14 {
    //给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
    public int integerBreak(int n){
        int[]dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),dp[j]*(i-j)));
            }
        }
        return dp[n];
    }
}
