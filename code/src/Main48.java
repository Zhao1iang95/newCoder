import java.util.ArrayList;
import java.util.List;

/**
 * @desc 最长不含重复字符的子字符串
 * @author zhaoliang
 * @date 20200414
 */
public class Main48 {
    //最长不重复子串就是从一个字符串中找到一个连续子串，该子串中任何两个字符都不能相同，且该子串的长度是最大的。
    public static void main(String[] args) {
        String str = "arabcacfr";
        System.out.println(lengthOfLongestSubstring(str));
    }

    private static int lengthOfLongestSubstring(String str) {
        if(str.length()==0)
            return 0;
        int maxLength=1;
        List<Character> list = new ArrayList<>();
        list.add(str.charAt(0));
        for(int i=1;i<str.length();i++) {
            if(list.contains(str.charAt(i))) {
                //返回与当前字符相同字符的索引
                int index = list.indexOf(str.charAt(i));
                //sublist左闭右开区间
                list = list.subList(index+1, list.size());
                list.add(str.charAt(i));
                //比较原来的长还是现在的长，返回大的
                maxLength = Math.max(maxLength, list.size());
            }else {
                list.add(str.charAt(i));
                maxLength = Math.max(maxLength, list.size());
            }
        }
        return maxLength;
    }
}
