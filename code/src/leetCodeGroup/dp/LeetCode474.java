package leetCodeGroup.dp;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 一和零
 * @create : 2020/09/16 10:43
 */
public class LeetCode474 {
    //在计算机界中，我们总是追求用有限的资源获取最大的收益。
    //现在，假设你分别支配着 m 个 0 和 n 个 1。另外，还有一个仅包含 0 和 1 字符串的数组。
    //你的任务是使用给定的 m 个 0 和 n 个 1 ，找到能拼出存在于数组中的字符串的最大数量。每个 0 和 1 至多被使用一次。
    public int findMaxForm(String[] strs,int m,int n){
        //这是一个多维费用的 0-1 背包问题，有两个背包大小，0 的数量和 1 的数量。
        if (strs == null || strs.length ==0){
            return 0;
        }
        int[][] dp = new int[m+1][n+1];
        for (String s:strs
             ) {
            int ones=0,zeros =0;
            for (char c:s.toCharArray()
                 ) {
                if (c=='0'){
                    zeros++;
                } else {
                    ones++;
                }
            }
            for (int i = m; i >=zeros ; i--) {
                for (int j = n; j >=ones ; j--) {
                    dp[i][j] = Math.max(dp[i][j],dp[i-zeros][j-ones]+1);
                }
            }
        }
        return dp[m][n];
    }
}
