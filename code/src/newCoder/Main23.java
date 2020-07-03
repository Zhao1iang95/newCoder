import java.util.ArrayList;

/**
 * @desc 二叉搜索树的后续遍历
 * @author zhaoliang
 * @date 20200507
 */
public class Main23 {
    //输入一个非空整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

    public boolean verifyPostorder(int[] postorder) {
        boolean flag = false;
        if(postorder.length==0){
            return false;
        }
        flag = recur(postorder,0,postorder.length-1);
        return flag;
    }
    boolean recur(int[] postorder,int i,int j){
        if (i>=j){
            return true;
        }
        int p=i;
        while(postorder[p]<postorder[j]){
            p++;
        }
        int m = p;
        while(postorder[p]>postorder[j]){
            p++;
        }
        return p==j&&recur(postorder,i,m-1)&& recur(postorder,m,j-1);
    }


}
