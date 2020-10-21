package leetCodeGroup.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 完全平方数
 * @create : 2020/09/11 10:04
 */
public class LeetCode279 {
    //给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
    public int numSquares(int n){
        List<Integer> squareList = generateSquareList(n);
        int[] dp = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            int min = Integer.MAX_VALUE;
            for (int square:squareList
                 ) {
                if (square > i){
                    break;
                }
                min = Math.min(min,dp[i - square]+1);
            }
            dp[i] = min;
        }
        return dp[n];
    }

    private List<Integer> generateSquareList(int n) {
        List<Integer> squareList = new ArrayList<>();
        int diff = 3;
        int square = 1;
        while (square<=n){
            squareList.add(square);
            square+=diff;
            diff+=2;
        }
        return squareList;
    }
}
