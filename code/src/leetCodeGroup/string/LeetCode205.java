package leetCodeGroup.string;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 同构字符串
 * @create : 2020/08/05 10:03
 */
public class LeetCode205 {
    //给定两个字符串 s 和 t，判断它们是否是同构的。
    //
    //如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
    //
    //所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
    public boolean isIsomorphic(String s,String t){
        int[] preIndexOfS = new int[256];
        int[] preIndexOfT = new int[256];
        for (int i = 0; i <s.length(); i++) {
            char sc = s.charAt(i),tc = t.charAt(i);
            if (preIndexOfS[sc] != preIndexOfT[tc]){
                return false;
            }
            preIndexOfS[sc] = i+1;
            preIndexOfT[tc] = i+1;
        }
        return true;
    }
}
