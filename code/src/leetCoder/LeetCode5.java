package leetCoder;


/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最长回文字串
 * @create : 2020/06/02 09:46
 */
public class LeetCode5 {
    public static String longestPalindrome(String s) {
     int len = s.length();
        // 特判
     if (len < 2){
         return s;
     }
     int maxLen = 1;
     int begin = 0;
        // 1. 状态定义
        // dp[i][j] 表示s[i...j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        char[] chars = s.toCharArray();
        // 2. 初始化
        for (int i = 0; i < len; i++) {
            dp [i][i] = true;
        }
        // 3. 状态转移
        // 注意：先填左下角
        // 填表规则：先一列一列的填写，再一行一行的填，保证左下方的单元格先进行计算
        for (int j = 1; j <len ; j++) {
            for (int i = 0; i <j ; i++) {
                // 头尾字符不相等，不是回文串
                if (chars[i] != chars[j]){
                    dp[i][j] = false;
                }else {
                    // 相等的情况下
                    // 考虑头尾去掉以后没有字符剩余，或者剩下一个字符的时候，肯定是回文串
                    if (j - i <3){
                        dp[i][j] = true;
                        // 状态转移
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                // 只要dp[i][j] == true 成立，表示s[i...j] 是否是回文串
                // 此时更新记录回文长度和起始位置
                if (dp[i][j] && j - i +1 >maxLen){
                    maxLen = j -i +1;
                    begin = i;
                }
            }

        }
        return s.substring(begin,begin+maxLen);
    }

    public static void main(String[] args) {
        String s = longestPalindrome("aaaa");
        System.out.println(s);
    }
}
