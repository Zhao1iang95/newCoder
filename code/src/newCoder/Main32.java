import java.util.ArrayList;
import java.util.Arrays;

/**
 * @desc 把数组排成最小的数
 * @author zhaoliang
 * @date 20200520
 */
public class Main32 {
    //输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个
    public String minNumber1(int[] nums) {
        String[] res = new String[nums.length];
        int len = nums.length;
            for (int i=0;i<len;i++){
                res[i] = String.valueOf(nums[i]);
            }
        Arrays.sort(res,(x,y)->(x+y).compareTo(y+x));
        StringBuilder str = new StringBuilder();
        for(String x:res){
            str.append(x);
        }
        return str.toString();
    }
}
