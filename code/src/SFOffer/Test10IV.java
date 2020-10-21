package SFOffer;

import java.util.Arrays;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 变态跳台阶
 * @create : 2020/09/22 10:34
 */
public class Test10IV {
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    public int JumpFloorII(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp,1);
        for (int i = 1; i <target ; i++) {
            for (int j = 0; j <i ; j++) {
                dp[i]+=dp[j];
            }
        }
        return dp[target-1];
    }
}
