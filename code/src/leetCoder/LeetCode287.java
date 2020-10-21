package leetCoder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 寻找重复数
 * @create : 2020/07/15 09:23
 */
public class LeetCode287 {
    //给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），
    //可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
    //不能更改原数组（假设数组是只读的）。
    //只能使用额外的 O(1) 的空间。
    //时间复杂度小于 O(n2) 。
    //数组中只有一个重复的数字，但它可能不止重复出现一次。
    //违反O(1)原则
    public int findDuplicate(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (map.getOrDefault(nums[i],0)<1){
                map.put(nums[i],1);
            }else {
                res =  nums[i];
            }
        }
        return res;
    }
    public int findDuplicate1(int[] nums){
        int len = nums.length;
        int left = 0;
        int right=len-1;
        while (left<right){
            int mid = (left+right)>>>1;
            int cnt = 0;
            for (int num:nums) {
                if(num<=mid){
                    cnt++;
                }
            }
            if(cnt > mid){
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return left;
    }
}
