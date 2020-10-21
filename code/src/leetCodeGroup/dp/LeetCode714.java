package leetCodeGroup.dp;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 买卖股票的最佳时机含手续费
 * @create : 2020/09/18 10:03
 */
public class LeetCode714 {
    //给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
    //
    //你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
    //
    //返回获得利润的最大值。
    //
    //注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。
    public int maxProfit(int[] price,int fee){
        int N = price.length;
        int[] buy = new int[N];
        int[] sell = new int[N];
        int[] s1 = new int[N];
        int[] s2 = new int[N];
        s1[0] = buy[0] = -price[0];
        sell[0] = s2[0] = 0;
        for (int i = 1; i <N ; i++) {
            buy[i] = Math.max(sell[i-1],s2[i-1])- price[i];
            s1[i] = Math.max(s1[i-1],buy[i-1]);
            sell[i] = Math.max(buy[i-1],s1[i-1])-fee + price[i];
            s2[i] = Math.max(s2[i-1],sell[i-1]);
        }
        return Math.max(sell[N-1],s2[N-1]);
     }

}
