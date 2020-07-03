import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 第一个只出现一次的字符
 * @create : 2020/05/21 07:06
 */
public class Main34 {
    /**
     * @description  在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
     * 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
     * @param str
     * @return int
     */
    public int FirstNotRepeatingChar(String str) {
        if (str.length()==0){
            return -1;
        }
        Map<Character,Boolean> map = new HashMap<>();
        char[] sc = str.toCharArray();
        for (char c:sc) {
            map.put(c,!map.containsKey(c));
        }
        int index = 0;
        for (char c :sc) {
            if (map.get(c)){
                return index;
            }else {
                index++;
            }
        }
        return 0;
    }

    /**
     * @description 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
     * @param s
     * @return
     */
    public char firstUniqChar(String s) {
      Map<Character,Boolean> map = new HashMap<>();
      char[] sc = s.toCharArray();
        for (char c : sc) {
            map.put(c,!map.containsKey(c));
        }
        for (char c : sc) {
            if (map.get(c)){
                return c;
            }
        }
        return ' ';
    }
}
