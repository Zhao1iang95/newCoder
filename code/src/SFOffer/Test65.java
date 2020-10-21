package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 不用加减乘除做加法
 * @create : 2020/10/06 08:38
 */
public class Test65 {
   //写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
   public int Add1(int num1,int num2){
       //a ^ b 表示没有考虑进位的情况下两数的和，(a & b) << 1 就是进位。
       //递归会终止的原因是 (a & b) << 1 最右边会多一个 0，那么继续递归，
       //进位最右边的 0 会慢慢增多，最后进位会变为 0，递归终止
       return num2==0 ? num1:Add1(num1 ^ num2,(num1&num2)<<1);
   }
    public int Add2(int num1,int num2){
        int result = 0;
        int ans=0;
        do {
          result = num1 ^ num2;
          ans = (num1 & num2)<<1;
          num1 = result;
          num2 = ans;
        }while (ans!=0);
        return result;
    }
}
