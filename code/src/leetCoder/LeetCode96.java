package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 不同的二叉搜索树
 * @create : 2020/06/24 08:51
 */
public class LeetCode96 {
    //给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
    public static int numTrees(int n) {

        long C = 1;
        for (int i = 0; i < n; ++i) {
            C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) C;
    }

    public static void main(String[] args) {
       System.out.println(numTrees(11));
    }
}
