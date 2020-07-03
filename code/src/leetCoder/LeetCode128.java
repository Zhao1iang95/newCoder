package leetCoder;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最长连续序列
 * @create : 2020/06/29 09:14
 */
public class LeetCode128 {
    //给定一个未排序的整数数组，找出最长连续序列的长度。
    //
    //要求算法的时间复杂度为 O(n)。
    public int findMaxLong(int[] nums){
        Set<Integer> num_set =new HashSet<>();
        for (int num:nums
             ) {
            num_set.add(num);
        }
        int longestStreak = 0;
        for (int num:num_set
             ) {
            if (!num_set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while (num_set.contains(currentNum+1)){
                    currentNum +=1;
                    currentStreak +=1;
                }
                longestStreak = Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
}
