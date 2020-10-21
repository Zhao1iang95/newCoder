package leetCodeGroup.bit;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 比特位计数
 * @create : 2020/08/12 15:10
 */
public class LeetCode338 {
    //给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
    public int[] countBits(int num){
        //对于数字 6(110)，它可以看成是 4(100) 再加一个 2(10)，因此 dp[i] = dp[i&(i-1)] + 1;
        int [] ret = new int[num+1];
        for (int i = 1; i <=num ; i++) {
            ret[i] = ret[i&(i-1)]+1;
        }
        return ret;
    }
}
