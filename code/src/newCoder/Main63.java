/**
 * @desc 股票的最大利润
 * @author zhaoliang
 * @date 20200422
 */
public class Main63 {
    //假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <2){
            return 0;
        }
        int min = prices[0];
        int maxPrice = prices[1] - min;

        for (int i = 2; i<prices.length ; ++i){
            if (prices[i - 1] < min){
                min = prices[i - 1];
            }
            int currentDiff = prices[i] - min;
            if (currentDiff > maxPrice){
                maxPrice = currentDiff;
            }
        }
        return Math.max(maxPrice, 0);
    }

    public static void main(String[] args) {
        int [] a = {7,6,4,3,1};
        System.out.println(maxProfit(a));
    }
}
