package leetCodeGroup.map;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 判断二分图
 * @create : 2020/08/10 11:18
 */
public class LeetCode785 {
    //给定一个无向图graph，当这个图为二分图时返回true。
    //如果我们能将一个图的节点集合分割成两个独立的子集A和B，并使图中的每一条边的两个节点一个来自A集合，一个来自B集合，我们就将这个图称为二分图。
    //graph将会以邻接表方式给出，graph[i]表示图中与节点i相连的所有节点。每个节点都是一个在0到graph.length-1之间的整数。
    //这图中没有自环和平行边： graph[i] 中不存在i，并且graph[i]中没有重复的值。
    //深度优先，染色
    public boolean isBipartite(int[][] graph){
        int[] colors = new int[graph.length];
        Arrays.fill(colors,-1);//全部染成-1
        for (int i = 0; i <graph.length ; i++) {//处理图不是联通的情况
            if(colors[i] == -1 && !isBipartite(i,0,colors,graph)){
                return false;
            }
        }
        return true;
    }
    private boolean isBipartite(int curNode,int curColor,int[] colors,int[][]graph){
        if(colors[curNode]!=-1){//被染过
            return colors[curNode] == curColor;//判断当前颜色和之前染的0是否一样，一样则返回true，不是二分图，不一样返回false，是二分图
        }
        colors[curNode] = curColor;//第一次染色成0
        for (int nextNode:graph[curNode]) {
            if (!isBipartite(nextNode,1-curColor,colors,graph)){//相邻节点染成1
                return false;
            }
        }
        return true;
    }
}
