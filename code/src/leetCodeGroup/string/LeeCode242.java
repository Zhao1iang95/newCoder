package leetCodeGroup.string;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 有效的字母异位词
 * @create : 2020/08/05 09:46
 */
public class LeeCode242 {
    //给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
    public boolean isAnagram(String t,String s){
            int[] cnts = new int[26];
            for (char c : s.toCharArray()){
                cnts[c - 'a']++;
            }
            for (char c : t.toCharArray()){
                cnts[c - 'a']--;
            }
            for (int cnt : cnts){
                if (cnt!=0){
                    return false;
                }
            }
            return true;
    }
}
