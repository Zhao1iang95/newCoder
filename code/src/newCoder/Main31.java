/**
 * @author zhaoliang
 * @desc 1～n整数中1出现的次数
 * @date 20200519
 */
public class Main31 {
    //输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
    //
    //例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
    //暴力法
    public int countDigitOne1(int n) {
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            int x = i;
            while (x != 0) {
                if (x % 10 == 1) {
                    sum++;
                }
                x = x / 10;
            }
        }
        return sum;
    }

    //拆分n
    public int countDigitOne2(int n) {
        if (n == 0) {
            return 0;
        }
        String str = String.valueOf(n);
        int len = str.length();
        if (len == 1) {
            return 1;
        }
        int res = (int) Math.pow(10,len-1);
        int firstNumber = n / res;
        int firstBit = firstNumber == 1 ? (n % res) +1:res;
        int otherBit = (len-1) * firstNumber * res/10;//剩余位的个数（C（len-1,1）->从剩余的len-1位中选取一位来作为1）
        return firstBit+otherBit +countDigitOne2(n % res);
    }
}
