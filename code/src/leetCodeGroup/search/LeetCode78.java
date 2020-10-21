package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 子集
 * @create : 2020/09/09 08:05
 */
public class LeetCode78 {
    //给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
    //说明：解集不能包含重复的子集。
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            dfs(0,res,tempList,i,nums);
        }
        return res;
    }

    private void dfs(int start, List<List<Integer>> res, List<Integer> tempList, int size, int[] nums) {
        if (tempList.size() == size){
            res.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i <nums.length ; i++) {
            tempList.add(nums[i]);
            dfs(i+1,res,tempList,size,nums);
            tempList.remove(tempList.size()-1);
        }
    }

}
