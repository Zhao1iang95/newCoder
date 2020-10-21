package leetCoder;

import java.util.ArrayList;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 除自身外数组的乘积
 * @create : 2020/07/13 08:30
 */
public class LeetCode238 {
    //暴力
    public int[] productExceptSelf(int[] nums){
        if (nums.length==0)return new int[0];
        int [] res = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
           int p = 1;
            for (int j = 0; j <nums.length ; j++) {
                if(j!=i){
                    p *=nums[i];
                }
            }
           res[i] = p;
        }
        return res;
    }
    //前后缀写法
    public int[] productExceptSelf1(int[] nums){
        int length = nums.length;
        int [] answer = new int[length];
        answer[0]=1;
        for (int i = 1; i <length ; i++) {
            answer[i] = nums[i-1] * answer[i-1];
        }
        int p=1;
        for (int j = length-1; j >=0 ; j--) {
            answer[j] = answer[j] * p;
            p*=nums[j];
        }
        return answer;
    }
}
