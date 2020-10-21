package leetCodeGroup.map;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 冗余连接
 * @create : 2020/08/10 15:49
 */
public class LeetCode684 {
    //在本问题中, 树指的是一个连通且无环的无向图。
    //
    //输入一个图，该图由一个有着N个节点 (节点值不重复1, 2, ..., N) 的树及一条附加的边构成。
    // 附加的边的两个顶点包含在1到N中间，这条附加的边不属于树中已存在的边。
    //
    //结果图是一个以边组成的二维数组。每一个边的元素是一对[u, v] ，满足 u < v，表示连接顶点u 和v的无向图的边。
    //
    //返回一条可以删去的边，使得结果图是一个有着N个节点的树。如果有多个答案，则返回二维数组中最后出现的边。
    // 答案边 [u, v] 应满足相同的格式 u < v。
    public int[] findRedundantConnection(int[][] edges){
        int N = edges.length;
        UF uf = new UF(N);
        for (int[] e:edges){
            int u = e[0],v = e[1];
            if(uf.connect(u,v)){
                return e;
            }
            uf.union(u,v);
        }
        return new int[]{-1,-1};
    }
    private class UF{
        private int[] id;
        UF(int N){
            id = new int[N+1];
            for (int i = 0; i <id.length ; i++) {
                id[i] = i;
            }
        }
        void union(int u,int v){
            int uID = find(u);
            int vID = find(v);
            if(uID == vID){
            return;
            }
            for (int i = 0; i <id.length ; i++) {
                if(id[i] == uID){
                    id[i] =vID;
                }
            }
        }
        int find(int p){
            return id[p];
        }
        boolean connect(int u,int v){
            return find(u)==find(v);
        }
    }
}
