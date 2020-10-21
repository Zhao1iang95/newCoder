package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 连续子数组的最大和
 * @create : 2020/09/30 08:41
 */
public class Test42 {
    //{6, -3, -2, 7, -15, 1, 2, 2}，连续子数组的最大和为 8（从第 0 个开始，到第 3 个为止）。
    public int FindGreatestSumOfSubArray(int[] array){
        if (array==null || array.length==0)return 0;
        int greatestSum = Integer.MIN_VALUE;
        int sum =0;
        for (int val:array
             ) {
            sum = sum <=0?val:sum+val;
            greatestSum = Math.max(greatestSum,sum);
        }
        return greatestSum;
    }
}
