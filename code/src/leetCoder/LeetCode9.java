package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 回文数
 * @create : 2020/06/04 09:14
 */
public class LeetCode9 {
    public boolean isPalindrome(int x) {
        //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        if (x < 0){
            return false;
        }
        int help = 1;//记录一共有几位
        int temp = x;
        while (temp >=10){
            help *= 10;
            temp /= 10;
        }
        while (x !=0){
            if (x % 10 !=x /help){
                return false;
            }
            x = x % help /10;
            help /=100;
        }
        return true;
    }
}
