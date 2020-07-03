package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 爬楼梯
 * @create : 2020/06/21 09:47
 */
public class LeetCode70 {
    //假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
    //
    //每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
    //
    //注意：给定 n 是一个正整数。
    public int climbStairs(int n) {
        int [] a ={0,1,2};
        if (n<3){
            return a[n];
        }
        int first =1;
        int second = 2;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = first +second;
            first = second;
            second = res;
        }
        return res;
    }
}
