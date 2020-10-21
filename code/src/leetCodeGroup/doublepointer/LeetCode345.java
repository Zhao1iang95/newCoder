package leetCodeGroup.doublepointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 反转字符串中的元音字母
 * @create : 2020/08/13 09:59
 */
public class LeetCode345 {
    //编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
    );
    public String reverseVowels (String s){
        if (s==null)return null;
        int start=0;int end = s.length()-1;
        char[] ret = new char[s.length()];
        while(start<=end){
            char i = s.charAt(start);
            char j = s.charAt(end);
            if(!vowels.contains(i)){
                ret[start++] = i;
            }else if(!vowels.contains(j)){
                ret[end--] = j;
            }else {
                ret[start++] = j;
                ret[end--] = i;
            }
        }
        return new String(ret);
    }
}
