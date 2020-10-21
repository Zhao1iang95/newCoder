package leetCodeGroup.map;

import leetCodeGroup.list.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 课程表
 * @create : 2020/08/10 14:37
 */
public class LeetCode207 {
    //你这个学期必须选修 numCourse 门课程，记为 0 到 numCourse-1 。
    //
    //在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们：[0,1]
    //
    //给定课程总量以及它们的先决条件，请你判断是否可能完成所有课程的学习？
    public boolean canFinish(int numCourses,int[][]prerequisites){
        //本题不需要使用拓扑排序，只需要检测有向图是否存在环即可
        List<Integer>[] graphic = new List[numCourses];
        for (int i = 0; i <numCourses ; i++) {
            graphic[i] = new ArrayList<>();
        }
        for (int[] pre:prerequisites) {
            graphic[pre[0]].add(pre[1]);
        }
        boolean [] globalMarked = new boolean[numCourses];
        boolean [] localMarked = new boolean[numCourses];
        for (int i = 0; i <numCourses ; i++) {
            if(hasCycle(globalMarked,localMarked,graphic,i)){
                return  false;
            }
        }
        return true;
    }

    private boolean hasCycle(boolean[] globalMarked, boolean[] localMarked, List<Integer>[] graphic, int curNode) {
        if (localMarked[curNode]){
            return true;
        }
        if(globalMarked[curNode]){
            return false;
        }
        globalMarked[curNode] = true;
        localMarked[curNode] = true;
        for (int nextNode:graphic[curNode]) {
            if(hasCycle(globalMarked,localMarked,graphic,nextNode)){
                return true;
            }
        }
        localMarked[curNode] = false;
        return false;
    }
}
