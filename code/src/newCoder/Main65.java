/**
 * @desc 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @author zhaoliang
 * @date 20200422
 */
public class Main65 {
    //写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
    //例如：5 ->00101,17 - > 10001
    public static int Add(int num1,int num2) {
        int sum1 , sum2;
        do {
            sum1 = num1 ^ num2 ;//异或，0，0为；1，1为0；1，0为1；0，1为1；
            //00101 ^ 10001 = 10100;
            sum2 = (num1 & num2) <<1;//与，有1为1；当1，1时进位，左移一位
            //00101 & 10001 = 00010；
            num1 = sum1;
            num2 = sum2;
        }while (num2 != 0);
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(Add(5,17));
        //5 ->00101,17 - > 10001
        //00101 ^ 10001 = 10100 = 20,00101 & 10001<<1 = 10 = 2
        //10100 ^ 10 = 10110,10100 & 10 <<1 = 0000=0
        //return 10110
    }
}
