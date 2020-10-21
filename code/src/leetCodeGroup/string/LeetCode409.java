package leetCodeGroup.string;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最长回文串
 * @create : 2020/08/05 09:53
 */
public class LeetCode409 {
    //给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
    //
    //在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
    //
    //注意:
    //假设字符串的长度不会超过 1010。
    public int longestPalindrome(String s){
        int[] cnts = new int[256];
        for(char c : s.toCharArray()){
            cnts[c]++;
        }
        int palindrome = 0;
        for(int cnt : cnts){
            palindrome+=(cnt/2)*2;
        }
        if (palindrome<s.length()){
            palindrome++;
        }
        return palindrome;
    }
}
