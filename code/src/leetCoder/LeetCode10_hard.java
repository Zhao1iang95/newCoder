package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 正则表达式匹配
 * @create : 2020/06/05 09:39
 */
public class LeetCode10_hard {
    //
    public boolean isMatch(String s, String p) {
        //用于保存中间结果
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        //将右下角置为true
        //从后往前匹配
        dp[s.length()][p.length()] = true;
        //i从越界开始补齐最后一列
        //由于dp的右下角已经赋值
        //所以不用重复判断所以j从length-1开始
        for (int i = s.length(); i >=0 ; i--) {
            for (int j = p.length()-1; j >=0 ; j--) {
                //判断字符是否相等
                boolean first_match = (i<s.length()&& (p.charAt(j) == s.charAt(i)||p.charAt(j) == '.'));
                //涉及了*号匹配
                if (j +1 <p.length() && p.charAt(j+1) == '*'){
                    //状态转换方程
                    //若后一个字符为*那么涉及了*号匹配
                    //规律就是看跳过两个是否匹配（也代表了*号的可以是0个匹配字符的性质）
                    //或者匹配*号当前的字符是否匹配且j不用改变i继续后移看看是否匹配
                    dp[i][j] = dp[i][j+2] || first_match&&dp[i+1][j];
                }else {
                    //不涉及*号的匹配
                    //就看之前的字符是否匹配以及当前字符是否匹配即可
                    dp[i][j] = first_match && dp[i+1][j+1];
                }
            }
        }
        //dp[0][0]就代表着之后的全部匹配完成看看是否全部匹配
        return dp[0][0];
    }
}
