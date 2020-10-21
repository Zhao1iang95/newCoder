package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 正则表达式匹配
 * @create : 2020/09/24 08:59
 */
public class Test19hard {
    //请实现一个函数用来匹配包括 '.' 和 '*' 的正则表达式。模式中的字符 '.' 表示任意一个字符，而 '*' 表示它前面的字符可以出现任意次（包含 0 次）。
    public boolean match(char[] str,char[] pattern){
        int n = str.length;
        int m = pattern.length;
        boolean[][]f = new boolean[n+1][m+1];
        if (n==0 && m==0)return true;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=m ; j++) {
                //分成空正则和非空正则两种
                if (j==0){
                    f[i][j] = i == 0;
                }else {
                    //非空正则分两种情况 *和非*
                    if (pattern[j-1]!='*'){
                        if (i >0 && (str[i-1] == pattern[j-1] || pattern[j-1] == '.')){
                            f[i][j] = f[i-1][j-1];
                        }
                    }else {
                        //碰到*，分看和不看两种情况
                        //不看
                        if (j >=2){
                            f[i][j] |=f[i][j-2];
                        }
                        //看
                        if (i>=1 && j >=2 && (str[i-1] == pattern[j-2] || pattern[j-2] == '.')){
                            f[i][j] |=f[i-1][j];
                        }
                    }
                }
            }
        }
        return f[n][m];
    }
}
