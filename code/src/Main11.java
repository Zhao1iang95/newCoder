/**
 * @author zhaoliang
 * @desc 二进制中1的个数
 * @date 20200429
 */
public class Main11 {
    //输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
    public int NumberOf1(int n) {
        int sum = 0;//记录1的个数
        int temp = 1;//本质上是用temp变量去判读n的每一位是否为0
        while (temp != 0) {//当temp左移32次，判断结束

            sum = (n & temp) != 0 ? sum + 1 : sum;

            temp = temp << 1;

        }
        return sum;
    }
//例 5->101
    //101-001=100
    //101 & 100 = 100
    //100 -001 = 011;
    //100 & 011 = 000
    public int NumberOf1_(int n) {
        int sum = 0;//记录1的个数

        while (n != 0) {//n不等0必有1
            sum++;
            n = n & (n - 1);//从右往左消除1
        }
        return sum;
    }
}
