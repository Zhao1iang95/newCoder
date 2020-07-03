package leetCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 子集
 * @create : 2020/06/23 09:06
 */
public class LeetCode78 {
    //给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
    //
    //说明：解集不能包含重复的子集。
    public List<List<Integer>> subsets(int[] nums) {
        //回溯法
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0,nums,res,new ArrayList<Integer>());
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> temp) {
        res.add(new ArrayList<>(temp));
        for (int j = i; j <nums.length ; j++) {
            temp.add(nums[j]);
            backtrack(j+1,nums,res,temp);
            temp.remove(temp.size()-1);
        }
    }
}
