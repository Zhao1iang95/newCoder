package leetCodeGroup.string;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 回文数
 * @create : 2020/08/05 10:44
 */
public class LeetCode9 {
    //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    public boolean isPalindrome(int x){
        if(x ==0){
            return true;
        }
        if(x <0 || x%10==0){
            return false;
        }
        int right =0;
        while(x > right){
            right = right*10 + x%10;
            x /=10;
        }
        return x ==right || x==right/10;
    }
}
