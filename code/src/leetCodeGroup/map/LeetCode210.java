package leetCodeGroup.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 课程表II
 * @create : 2020/08/10 15:16
 */
public class LeetCode210 {
    //现在你总共有 n 门课需要选，记为 0 到 n-1。
    //在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: [0,1]
    //给定课程总量以及它们的先决条件，返回你为了学完所有课程所安排的学习顺序。
    //可能会有多个正确的顺序，你只要返回一种就可以了。如果不可能完成所有课程，返回一个空数组。
    public int[] findOrder(int numCourses,int[][] prerequisites) {
        List<Integer>[] graphic = new List[numCourses];
        for (int i = 0; i <numCourses ; i++) {
            graphic[i] = new ArrayList<>();
        }
        for (int[] pre : prerequisites){
            graphic[pre[0]].add(pre[1]);
        }
        Stack<Integer> postOrder = new Stack<>();
        boolean[] globalMarked = new boolean[numCourses];
        boolean[] localMarked = new boolean[numCourses];
        for (int i = 0; i <numCourses ; i++) {
            if (hasCycle(globalMarked,localMarked,graphic,i,postOrder)){
                return new int[0];
            }
        }
        int[] orders = new int[numCourses];
        for (int i = numCourses-1; i >=0 ; i--) {
            orders[i] = postOrder.pop();
        }
        return orders;
    }

    private boolean hasCycle(boolean[] globalMarked, boolean[] localMarked, List<Integer>[] graphic, int curNode, Stack<Integer> postOrder) {
        if(localMarked[curNode]){
            return true;
        }
        if(globalMarked[curNode]){
            return false;
        }
        globalMarked[curNode] = true;
        localMarked[curNode] = true;
        for (int nextNode:graphic[curNode]) {
            if(hasCycle(globalMarked,localMarked,graphic,nextNode,postOrder)){
                return true;
            }
        }
        localMarked[curNode] = false;
        postOrder.push(curNode);
        return false;
    }
}
