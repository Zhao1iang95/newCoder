package leetCoder;

import java.util.*;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 单词拆分
 * @create : 2020/06/30 09:55
 */
public class LeetCode139 {
    //给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
    public boolean wordBreak(String s, List<String> wordDict){
     ArrayList<Integer> array = new ArrayList<>();

     Set<String> set = new HashSet<>(wordDict);
     boolean[] dp = new boolean[s.length()+1];
     dp[0] =true;
        for (int i = 1; i <=s.length() ; i++) {
            for (int j = 0; j <i ; j++) {
                if (dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] =true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
