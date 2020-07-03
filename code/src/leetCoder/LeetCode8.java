package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 字符串转换整数
 * @create : 2020/06/04 08:28
 */
public class LeetCode8 {
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        int idx = 0;
        while (idx < n && chars[idx] == ' '){
            //去掉前导空格
            idx++;
        }
        if (idx == n){
            //去掉前导空格以后到了末尾了
            return 0;
        }
        boolean negative = false;
        if (chars[idx] == '-'){
            //遇到负号
            negative = true;
            idx++;
        }else if(chars[idx] == '+'){
            idx++;
        }else if(!Character.isDigit(chars[idx])){
            //  其他符号
            return 0;
        }
        int ans = 0;
        while (idx < n && Character.isDigit(chars[idx])){
            int digit = chars[idx] - '0';
            if (ans  > (Integer.MAX_VALUE - digit) / 10){
                //本来应该是判断 ans * 10 + digit > Integer.MAX_VALUE
                //为了避免越界移到右边
                return negative ? Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            idx ++;
        }
        return negative ? -ans:ans;
    }
}
