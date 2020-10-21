package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 搜索二维矩阵
 * @create : 2020/07/14 08:39
 */
public class LeetCode240 {
    //剪治，从右上角开始
    public boolean searchMatrix(int[][]matrix,int target){
        if (matrix==null || matrix.length==0)return false;
        int row = matrix.length;
        int col = matrix[0].length;
        int rs = 0;
        int cs = col-1;
        while (rs<row && cs>=0){
            if (matrix[rs][cs] > target){
                cs--;
            }else if(matrix[rs][cs] <target){
                rs++;
            }else {
                return true;
            }
        }

        return false;
    }
    //二分查找
    public boolean searchMatrix1(int[][]matrix,int target){
        if(matrix.length==0 || matrix[0].length==0)return false;
        for (int i = 0; i <matrix.length; i++) {
            if (matrix[i][0] > target)break;
            if(matrix[i][matrix[0].length-1] < target)continue;
            int col = binarySearch(matrix[i],target);
            if(col!=-1){
                return true;
            }
        }

        return false;
    }

    private int binarySearch(int[] matrix, int target) {
        int start = 0;
        int end = matrix.length-1;
        while (start<=end){
            int mid = (start+end)>>>1;
            if(matrix[mid] == target){
                return mid;
            }else if(matrix[mid]<target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

}
