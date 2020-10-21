package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 组合
 * @create : 2020/09/08 09:15
 */
public class LeetCode77 {
    //给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合
    public List<List<Integer>> combine(int n,int k){
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> combineList = new ArrayList<>();
        dfs(combineList,combinations,1,k,n);
        return combinations;
    }

    private void dfs(List<Integer> combineList, List<List<Integer>> combinations, int start, int k, int n) {
        if (k ==0){
            combinations.add(new ArrayList<>(combineList));
            return;
        }
        for (int i = start; i <=n-k+1 ; i++) {
            combineList.add(i);
            dfs(combineList,combinations,i+1,k-1,n);
            combineList.remove(combineList.size()-1);
        }
    }
}
