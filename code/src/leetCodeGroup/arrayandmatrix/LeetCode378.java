package leetCodeGroup.arrayandmatrix;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 有序矩阵中第K小的元素
 * @create : 2020/08/06 10:39
 */
public class LeetCode378 {
    //给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
    //请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
    public int kthSmallest(int [][] matrix,int k){
        int m = matrix.length,n = matrix[0].length;
        int lo = matrix[0][0];
        int hi = matrix[m-1][n-1];
        while (lo<=hi){
            int mid = lo+(hi-lo)/2;
            int cnt = 0;
            for (int i = 0; i <m ; i++) {
                for (int j = 0; j <n && mid>=matrix[i][j] ; j++) {
                    cnt++;
                }
            }
            if (cnt<k)lo = mid+1;
            else hi = mid-1;
        }
        return lo;
    }
}
