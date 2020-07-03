package leetCoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 括号生成
 * @create : 2020/06/10 09:54
 */
public class LeetCode22 {
    //数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
    public List<String> generateParenthesis(int n) {
        //深搜
        List<String> res = new ArrayList<>();
        if (n==0){
            return res;
        }
        dfs("",0,0,n,res);
        return res;
    }

    private void dfs(String StrRes, int left, int right,int n, List<String> res) {
        if (left==n && right == n){
            res.add(StrRes);
            return;
        }
        if (left < right){
            return;
        }
        if (left < n){
            dfs(StrRes+"(",left+1,right,n,res);
        }
        if (right <n){
            dfs(StrRes+")",left,right+1,n,res);
        }
    }
}
