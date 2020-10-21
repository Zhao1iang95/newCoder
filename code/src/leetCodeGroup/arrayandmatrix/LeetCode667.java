package leetCodeGroup.arrayandmatrix;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 优美的排列
 * @create : 2020/08/07 10:07
 */
public class LeetCode667 {
    //给定两个整数 n 和 k，你需要实现一个数组，这个数组包含从 1 到 n 的 n 个不同整数，同时满足以下条件：
    //
    //① 如果这个数组是 [a1, a2, a3, ... , an] ，那么数组 [|a1 - a2|,
    //|a2 - a3|, |a3 - a4|, ... , |an-1 - an|] 中应该有且仅有 k 个不同整数；.
    //
    //② 如果存在多种答案，你只需实现并返回其中任意一种.
    public int[] constructArray(int n,int k){
        int[] ret = new int[n];
        ret[0] = 1;
        for (int i = 1,interval = k; i <=k ; i++,interval--) {
            //1 mod 2 = 1
            ret[i] = i %2 ==1?ret[i-1]+interval:ret[i-1] - interval;
        }
        for (int i = k+1; i <n ; i++) {
            ret[i] = i+1;
        }
        return ret;
    }
}
