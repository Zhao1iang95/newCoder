package leetCodeGroup.greedy;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 买卖股票的最佳时机II
 * @create : 2020/08/19 10:19
 */
public class LeetCode122 {
    //给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
    //
    //设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
    //
    //注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
    public int maxProfit(int [] prices){
        //对于 [a, b, c, d]，如果有 a <= b <= c <= d ，那么最大收益为 d - a。而 d - a = (d - c) + (c - b) + (b - a) ，
        // 因此当访问到一个 prices[i] 且 prices[i] - prices[i-1] > 0，那么就把 prices[i] - prices[i-1] 添加到收益中。
        int profit=0;
        for (int i = 1; i <prices.length ; i++) {
            if(prices[i] > prices[i-1]){
                profit +=(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}
