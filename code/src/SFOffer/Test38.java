package SFOffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 字符串的排列
 * @create : 2020/09/29 09:50
 */
public class Test38 {
    //输入一个字符串,按字典序打印出该字符串中字符的所有排列。
    //例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
    private ArrayList<String> ret = new ArrayList<>();
    public ArrayList<String> Permutation(String str){
        if (str.length() == 0){
            return ret;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        backtracking(chars,new boolean[chars.length],new StringBuilder());
        return ret;
    }

    private void backtracking(char[] chars, boolean[] hasUsed, StringBuilder s) {
        if (s.length() == chars.length){
            ret.add(s.toString());
            return;
        }
        for (int i = 0; i <chars.length ; i++) {
            if (hasUsed[i])
                continue;
            if (i!=0 && chars[i] == chars[i-1] && !hasUsed[i-1])
                continue;
            hasUsed[i] = true;
            s.append(chars[i]);
            backtracking(chars,hasUsed,s);
            s.deleteCharAt(s.length()-1);
            hasUsed[i] = false;
        }
    }
}
