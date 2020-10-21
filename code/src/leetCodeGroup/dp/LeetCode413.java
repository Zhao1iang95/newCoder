package leetCodeGroup.dp;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 等差数列划分
 * @create : 2020/09/11 09:30
 */
public class LeetCode413 {
    //如果一个数列至少有三个元素，并且任意两个相邻元素之差相同，则称该数列为等差数列。
    public int numberOfArithmeticSlices(int[] A){
    //dp[i] 表示以 A[i] 为结尾的等差递增子区间的个数。
    //因为递增子区间不一定以最后一个元素为结尾，可以是任意一个元素结尾，因此需要返回 dp 数组累加的结果。
        if (A==null || A.length == 0){
            return 0;
        }
        int n = A.length;
        int[] dp = new int[n];
        for (int i =2;i<n;i++){
            if (A[i]-A[i-1] == A[i-1]-A[i-2]){
                dp[i] = dp[i-1]+1;
            }
        }
        int total = 0;
        for (int cnt:dp
             ) {
            total+=cnt;
        }
        return total;
    }
}
