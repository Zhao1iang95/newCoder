package leetCoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 无重复字符的最长子串
 * @create : 2020/05/28 09:20
 */
public class LeetCode3 {
    //给定一个字符串，请你找出其中不含有重复字符的 最长子串的长度。
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Map<Character,Integer> map = new HashMap<>();
        char [] str = s.toCharArray();
        for (int end = 0,start =0; end <str.length ; end++) {
            if (map.containsKey(str[end])){
                start = Math.max(map.get(str[end]),start);
            }
            maxLen = Math.max(maxLen,end - start +1);
            map.put(str[end],end+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
