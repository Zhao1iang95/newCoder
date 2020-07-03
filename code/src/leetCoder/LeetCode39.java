package leetCoder;

import java.util.*;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 组合总数
 * @create : 2020/06/15 10:02
 */
public class LeetCode39 {
    /**
     * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
     * candidates 中的数字可以无限制重复被选取。
     * 说明：
     * 所有数字（包括 target）都是正整数。
     * 解集不能包含重复的组合。
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList<>();
        int len = candidates.length;

        Arrays.sort(candidates);

        dfs(candidates,len,target,0,new ArrayDeque<>(),res);

        return res;

    }
    void dfs(int[] candidates, int len , int residue, int begin, Deque<Integer> path,List<List<Integer>> res){
        if (residue == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <len ; i++) {
            if (residue - candidates[i] <0){
                break;
            }
            path.addLast(candidates[i]);
            dfs(candidates,len,residue - candidates[i],i,path,res);
            path.removeLast();
        }
    }
}
