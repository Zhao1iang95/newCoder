package leetCodeGroup.doublepointer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 验证回文字符串II
 * @create : 2020/08/13 10:30
 */
public class LeetCode680 {
    //给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
    public boolean validPalindrome(String s){
        for (int i = 0,j=s.length()-1; i <j ; i++,j--) {
            if (s.charAt(i)!=s.charAt(j)){
                return isPalindrome(s,i,j-1)||isPalindrome(s,i+1,j);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i<j){
            if (s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
