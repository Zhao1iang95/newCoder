package leetCodeGroup.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 存在重复元素
 * @create : 2020/08/04 09:24
 */
public class LeetCode217 {
    //给定一个整数数组，判断是否存在重复元素。
    //如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
    public boolean containsDuplicate(int [] nums){
        Set<Integer> set = new HashSet<>();
        for (Integer num:
             nums) {
            set.add(num);
        }
        return set.size()<nums.length;
    }
}
