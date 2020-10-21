package leetCodeGroup.doublepointer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 平方数之和
 * @create : 2020/08/13 09:41
 */
public class LeetCode633 {
    //给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
    public boolean judgeSquareSum(int c){
        if (c<0)return false;
        int start=0;int end =(int) Math.sqrt(c);
        while (start<=end){
            int sum = start*start + end*end;
            if(sum==c){
                return true;
            }else if(sum<c){
                start++;
            }else {
                end--;
            }
        }
        return false;
    }
}
