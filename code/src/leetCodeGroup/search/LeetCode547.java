package leetCodeGroup.search;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 朋友圈
 * @create : 2020/09/06 09:47
 */
public class LeetCode547 {
    //班上有 N 名学生。其中有些人是朋友，有些则不是。他们的友谊具有是传递性。如果已知 A 是 B 的朋友，B 是 C 的朋友，
    // 那么我们可以认为 A 也是 C 的朋友。所谓的朋友圈，是指所有朋友的集合。
    //
    //给定一个 N * N 的矩阵 M，表示班级中学生之间的朋友关系。如果M[i][j] = 1，
    // 表示已知第 i 个和 j 个学生互为朋友关系，否则为不知道。你必须输出所有学生中的已知的朋友圈总数。
    private int n;
    public int findCircleNum(int[][]M){
        n  =M.length;
        int circleNum = 0;
        boolean[] hasVisited = new boolean[n];
        for (int i = 0; i <n ; i++) {
            if (!hasVisited[i]){
                dfs(M,i,hasVisited);
                circleNum++;
            }
        }
        return circleNum;
    }
    private void dfs(int[][]M,int i,boolean[]hasVisited){
        hasVisited[i]=true;
        for (int k = 0; k <n ; k++) {
            if (M[i][k] == 1 && !hasVisited[k]){
                dfs(M,k,hasVisited);
            }
        }
    }
}
