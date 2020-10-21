package leetCodeGroup.greedy;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 买卖股票的最佳时机
 * @create : 2020/08/19 10:12
 */
public class LeetCode121 {
    //给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
    //
    //如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
    //
    //注意：你不能在买入股票前卖出股票。
    public int maxProfit(int[]prices){
        //只要记录前面的最小价格，将这个最小价格作为买入价格，然后将当前的价格作为售出价格，查看当前收益是不是最大收益。
        int n = prices.length;
        if(n==0)return 0;
        int soFarMin = prices[0];
        int max=0;
        for (int i = 1; i <n ; i++) {
            if (soFarMin > prices[i]){
                soFarMin = prices[i];
            }else {
                max = Math.max(max,prices[i] - soFarMin);
            }
        }
        return max;
    }
}
