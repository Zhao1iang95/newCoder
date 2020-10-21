package leetCodeGroup.dp;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description :最佳买卖股票时机含冷冻期
 * @create : 2020/09/18 09:15
 */
public class LeetCode309 {
    //给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
    //
    //设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
    //
    //你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
    //卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
    public int maxProfit(int [] prices){
        if(prices==null || prices.length==0){
            return 0;
        }
        int N = prices.length;
        int [] buy = new int[N];
        int [] s1 = new int[N];
        int [] sell = new int[N];
        int [] s2 = new int[N];
        s1[0] = buy[0] = -prices[0];
        sell[0] = s2[0] = 0;
        for (int i = 1; i <N ; i++) {
            buy[i] = s2[i-1] - prices[i];
            s1[i] = Math.max(buy[i-1],s1[i-1]);
            sell[i] = Math.max(buy[i-1],s1[i-1]) + prices[i];
            s2[i] = Math.max(s2[i-1],sell[i-1]);
        }
        return Math.max(sell[N-1],s2[N-1]);
    }
}
