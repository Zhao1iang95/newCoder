/**
 * @desc 数组中数字出现的次数
 * @author zhaoliang
 * @date 20200417
 */
public class Main56 {
    //一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        if (array.length != 0){
            int ans = 0;
            //通过for循环找到那两个出现过一次的数字的异或结果
            for (int x :array){
                ans ^=x;
            }
            //根据异或结果找到分割出这两个数字的方式 ->从右往左找到第一个位置不为0的地方
            int lastNumberOfOne = find(ans);
            num1[0] = 0;
            num2[0] = 0;
            for (int x :array){
                if (judge(x,lastNumberOfOne) == 0){
                num1[0] ^=x;//异或操作最后只剩只出现一次的数字，其他都为0
                }else {
                num2[0] ^=x;//异或操作最后只剩只出现一次的数字，其他都为0
                }
            }
        }
    }

    private int judge(int x, int lastNumberOfOne) {
        //判断x的从右往左看，第lastNumberOfOne位是否为1
        x>>= (lastNumberOfOne - 1);//将x的第lastNumberOfOne位移到最右边
        return x & 1;//与操作，相同为1，不同为0
    }

    private int find(int ans) {
        int sum = 1;
        int res = 1;
       while ((ans & res) == 0){
           sum ++;
           res <<=1;
       }
       return sum;
    }
}
