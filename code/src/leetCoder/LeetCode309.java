package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最佳买卖股票时机含冷冻期
 * @create : 2020/07/16 10:35
 */
public class LeetCode309 {
    //给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
    //
    //设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
    //
    //你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
    //卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
    public int maxProfit(int [] prices){
        if(prices.length==0)return 0;
        int f0 = -prices[0];
        int f1= 0;
        int f2=0;
        for (int i = 0; i <prices.length ; i++) {
            int newf0 = Math.max(f0,f2-prices[i]);
            int newf1 = f0+prices[i];
            int newf2 = Math.max(f1,f2);
            f0 = newf0;
            f1 = newf1;
            f2 = newf2;
        }
        return Math.max(f1,f2);
    }
    //股票交易日
    public int maxProfit1(int[] prices, int n) {
        // write code here
        int firstBuy = Integer.MIN_VALUE;
        int firstSale = Integer.MIN_VALUE;
        int secondBuy = Integer.MIN_VALUE;
        int secondSale = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            //花的最少
            firstBuy = Math.max(firstBuy,-prices[i]);
            //卖的最多
            firstSale = Math.max(firstSale,firstBuy+prices[i]);
            //还是花的最少
            secondBuy = Math.max(secondBuy,firstSale-prices[i]);
            //还是卖的最多
            secondSale = Math.max(secondSale,secondBuy+prices[i]);
        }
        return secondSale;
    }
}
