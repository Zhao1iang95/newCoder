package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 全排列
 * @create : 2020/09/07 10:50
 */
public class LeetCode46 {
    //给定一个 没有重复 数字的序列，返回其所有可能的全排列。
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> permuteList = new ArrayList<>();
        boolean[] hasVisited = new boolean[nums.length];
        dfs(permuteList,res,hasVisited,nums);
        return res;
    }

    private void dfs(List<Integer> permuteList, List<List<Integer>> res, boolean[] hasVisited, int[] nums) {
    if (permuteList.size() == nums.length){
        res.add(new ArrayList<>(permuteList));
        return;
    }
        for (int i = 0; i <hasVisited.length; i++) {
            if (hasVisited[i]){
                continue;
            }
            hasVisited[i] = true;
            permuteList.add(nums[i]);
            dfs(permuteList,res,hasVisited,nums);
            permuteList.remove(permuteList.size()-1);
            hasVisited[i] = false;
        }
    }
}
