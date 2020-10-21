package leetCodeGroup.string;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 回文子串
 * @create : 2020/08/05 10:22
 */
public class LeetCode647 {
    //给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
    //
    //具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
    private int cnt;
    public int countSubstrings(String s){
        for (int i = 0; i <s.length() ; i++) {
            extendSubstrings(s,i,i);// 奇数
            extendSubstrings(s,i,i+1);//偶数
        }
        return cnt;
    }

    private void extendSubstrings(String s, int start, int end) {
        while(start>0 && end<s.length() && s.charAt(start) == s.charAt(end) ){
            start--;
            end++;
            cnt++;
        }
    }
}
