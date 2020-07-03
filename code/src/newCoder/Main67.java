/**
 * @desc 字符串转换成整数
 * @author zhaoliang
 * @date 20200423
 */
public class Main67 {
    //将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
    public int StrToInt(String str) {
        int len = str.length();
        int index =0 ;
        //第一步删除前面的空格；
        while (index < len){
            if (str.charAt(index) == ' '){
                index++;
            }else {
                break;
            }
        }
        int flag = 0;
        long ans = 0;
        while (index < len){
            if (str.charAt(index) == '-' || str.charAt(index) =='+'){
                if (flag !=0){
                    return 0;//"-123-3"非法数字字符串
                }
                flag = str.charAt(index) =='-'?-1 :1;

            }else if (str.charAt(index) >='0' && str.charAt(index) <='9'){
                ans = ans * 10 + str.charAt(index) -'0';
                if (judge(ans,flag)){
                    return 0;
                }
            }else {
                return 0;
            }
            index++;
        }
        return flag == -1 ? (int) ans * (-1) * flag : (int) ans;
    }

    private boolean judge(long ans, int flag) {
        if (flag == -1){
            return ans * (-1) < Integer.MIN_VALUE;
        }else {
            return ans > Integer.MAX_VALUE;
        }
    }
}
