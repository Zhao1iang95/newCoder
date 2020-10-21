package leetCodeGroup.dp;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 爬楼梯
 * @create : 2020/09/10 08:41
 */
public class LeetCode70 {
    //假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
    //
    //每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
    //
    //注意：给定 n 是一个正整数。
    public int climbStairs(int n){
        //定义一个数组 dp 存储上楼梯的方法数（为了方便讨论，数组下标从 1 开始），dp[i] 表示走到第 i 个楼梯的方法数目。
        //
        //第 i 个楼梯可以从第 i-1 和 i-2 个楼梯再走一步到达，走到第 i 个楼梯的方法数为走到第 i-1 和第 i-2 个楼梯的方法数之和。
        if(n<=2){
            return n;
        }
        int f1 = 1,f2=2;
        for (int i = 2; i <n ; i++) {
            int cur = f1+f2;
            f1 = f2;
            f2 = cur;
        }
        return f2;
    }
}
