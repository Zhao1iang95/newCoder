package leetCodeGroup.doublepointer;

import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 通过删除字母匹配到字典里最长单词
 * @create : 2020/08/13 14:30
 */
public class LeetCode524 {
    //给定一个字符串和一个字符串字典，找到字典里面最长的字符串，
    //该字符串可以通过删除给定字符串的某些字符来得到。如果答案不止一个，返回长度最长且字典顺序最小的字符串。
    //如果答案不存在，则返回空字符串。
    public String findLongestWord(String s, List<String> d){
        //通过删除字符串 s 中的一个字符能得到字符串 t，
        // 可以认为 t 是 s 的子序列，我们可以使用双指针来判断一个字符串是否为另一个字符串的子序列。
        String longestWord = "";
        for (String target: d) {
            int l1 = longestWord.length(),l2 = target.length();
            if(l1>l2 || (l1==l2 && longestWord.compareTo(target)<0)){
                continue;
            }
            if(isSubstr(s,target)){
                longestWord = target;
            }
        }
        return longestWord;
    }

    private boolean isSubstr(String s, String target) {
        int i=0,j=0;
        while (i<s.length() && j<target.length()){
            if(s.charAt(i)==target.charAt(j)){
                j++;
            }
            i++;
        }
        return j == target.length();
    }
}
