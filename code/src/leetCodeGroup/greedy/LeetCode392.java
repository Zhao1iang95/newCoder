package leetCodeGroup.greedy;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 判断子序列
 * @create : 2020/08/20 15:14
 */
public class LeetCode392 {
    //给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
    //你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
    //字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。
    //（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
    //利用java indexOf
    public boolean isSubsequence(String s,String t){
        int index =-1;
        for (char c:s.toCharArray()) {
            index = t.indexOf(c,index+1);
            if (index==-1){
                return false;
            }
        }
        return true;
    }
    //贪心
    public boolean isSubsequence1(String s,String t){
        int m =s.length(),n=t.length();
        int i=0,j=0;
        while (i<m && j <n){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==m;
    }
}
