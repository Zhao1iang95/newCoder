package leetCodeGroup.dp;

import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 单词拆分
 * @create : 2020/09/17 10:04
 */
public class LeetCode139 {
    //给定一个非空字符串 s 和一个包含非空单词的列表 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
    public boolean wordBreak(String s, List<String> wordDict){
        //dict 中的单词没有使用次数的限制，因此这是一个完全背包
        //求解顺序的完全背包问题时，对物品的迭代应该放在最里层，对背包的迭代放在外层，只有这样才能让物品按一定顺序放入背包中。
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for (int i = 1; i <=n ; i++) {
            for (String word:wordDict){
                int len = word.length();
                if (len <=i && word.equals(s.substring(i-len,i))){
                    dp[i] = dp[i] || dp[i-len];
                }
            }
        }
        return dp[n];
    }
}
