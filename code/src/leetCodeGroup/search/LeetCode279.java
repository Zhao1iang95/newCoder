package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 完全平方数
 * @create : 2020/08/27 09:37
 */
public class LeetCode279 {
    //给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）
    //使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
    public int numSquares(int n){
        //可以将每个整数看成图中的一个节点，如果两个整数之差为一个平方数，那么这两个整数所在的节点就有一条边。
        //
        //要求解最小的平方数数量，就是求解从节点 n 到节点 0 的最短路径。
        List<Integer> squares = generateSquares(n);
        Queue<Integer> queue = new LinkedList<>();
        boolean[]marked = new boolean[n+1];
        queue.add(n);
        marked[n] = true;
        int level = 0;
        while (!queue.isEmpty()){
            int size  =queue.size();
            level++;
            while (size-- >0){
                int cur = queue.poll();
                for (int s:squares){
                    int next = cur - s;
                    if (next<0){
                        break;
                    }
                    if (next==0){
                        return level;
                    }
                    if (marked[next]){
                        continue;
                    }
                    marked[next] = true;
                    queue.add(next);
                }
            }
        }
        return n;
    }

    /**
     * 生成小于n的平方数列
     * @param n
     * @return
     */
    private List<Integer> generateSquares(int n) {
        List<Integer> res = new ArrayList<>();
        int square = 1;
        int diff = 3;
        while (square<=n){
            res.add(square);
            square+=diff;
            diff+=2;
        }
        return res;
    }
}
