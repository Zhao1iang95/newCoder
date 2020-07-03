package leetCoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 只出现一次的数字
 * @create : 2020/06/30 08:46
 */
public class LeetCode136 {
    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public int singleNumber(int[] nums){
        Map<Integer,Boolean> map = new HashMap<>();

        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],true);
            }else {
                map.put(nums[i],false);
            }
        }
        AtomicInteger res = new AtomicInteger();

        map.forEach((k,v)->{
            if (!map.get(k)){
                res.set(k);
            }
        });
        return res.intValue();
    }
    //异或，相同为0，不同为1
    //任何数和0异或都是本身
    //任何数和自身异或都是0
    public int singleNumber1(int[] nums){
        int ans = 0;
        for (int num:nums) {
            ans ^= num;
        }
        return ans;
    }
}
