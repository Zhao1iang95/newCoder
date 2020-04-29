/**
 * @desc 1~n的整数中1出现的次数
 * @author zhaoliang
 * @date 20200413
 */
public class Main43 {
    //方法一
//    public int NumberOf1Between1AndN_Solution(int n) {
//        int sum = 0;
//        for(int i = 1;i<=n; i++){
//            int x = i;
//            while(x!= 0){
//                if (x % 10 ==1){
//                    sum++;
//                }
//                //多位数，例如11，出现两次
//                x = x/10;
//            }
//        }
//        return sum;
//    }
    //方法二
    //思路：主要是分为两种情况；
    // 1；最高位为1，
    // 2：其他位为1
public int NumberOf1Between1AndN_Solution(int n) {
    if (n == 0){
        return 0;
    }
    String str ="" +n;
    int len = str.length();
    if (len == 1){
        return 1;
    }
    int res = (int)Math.pow(10,len-1);//获取当前n的幂级
//    int firstNumber = str.charAt(0) - '0';
      int firstNum = n /res;
      int firstBit = firstNum == 1?(n % res)+1:res;
      int otherBit = (len-1)*firstNum *res /10;//len-1意思就是剩余位的个数（C(len-1,1)->从剩余的len减一位选取一位来作为1），res/10；
    return firstBit + otherBit + NumberOf1Between1AndN_Solution(n%res);
}
}
