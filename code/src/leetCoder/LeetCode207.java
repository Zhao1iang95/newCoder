package leetCoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 课程表
 * @create : 2020/07/09 09:14
 */
public class LeetCode207 {
    //你这个学期必须选修 numCourse 门课程，记为 0 到 numCourse-1 。
    //
    //在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们：[0,1]
    //
    //给定课程总量以及它们的先决条件，请你判断是否可能完成所有课程的学习？
    //广度优先，拓扑排序，邻接表，辅助队列
    public boolean canFinish(int numCourses,int[][]prerequisites){
        //定义一个数组来存储课程的入度
        int [] indegrees = new int[numCourses];
        //队列用来排序
        Queue<Integer> queue = new LinkedList<>();
        //初始化所有课程的入度
        for (int[] cp:prerequisites) {
            indegrees[cp[0]]++;
        }
        //所有入度为0的课程入队，然后将标记为-1，防止后面重复入队
        for (int i = 0; i <indegrees.length ; i++) {
            if (indegrees[i] == 0){
                queue.add(i);
                indegrees[i]--;
            }
        }
        //开始出队，维护入度数组，将入度为0的数组入队
        while (!queue.isEmpty()){
            int course  = queue.poll();
            for (int[] arr:prerequisites) {
                if (arr[1] == course) {
                    indegrees[arr[0]]--;

                }
                for (int i = 0; i <indegrees.length ; i++) {
                    if (indegrees[i]==0){
                        queue.add(i);
                        indegrees[i] = -1;
                    }
                }   
            }
        }
        return numCourses == 0;
     }
}
