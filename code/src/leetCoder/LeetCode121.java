package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 买卖股票的最佳时机
 * @create : 2020/06/28 09:25
 */
public class LeetCode121 {
    //给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
    //
    //如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
    //
    //注意：你不能在买入股票前卖出股票。
    //暴力
    public int maxProfit(int[] prices){
        int len = prices.length;
        if (len==0){
            return 0;
        }
        int maxRes = 0;
        for (int i = 0; i <len ; i++) {
            int maxIndex = 0;
            for (int j = i+1; j <len ; j++) {
                if (prices[j] - prices[i] >0){
                    maxIndex = Math.max(maxIndex,(prices[j] - prices[i]));
                }
            }
            maxRes =Math.max(maxRes,maxIndex);
        }
        return maxRes;
    }
    //一次遍历
    public int maxProfit1(int[]prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i <prices.length ; i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }else if (prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
