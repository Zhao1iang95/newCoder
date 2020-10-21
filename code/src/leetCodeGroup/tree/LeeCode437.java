package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 路径总和III
 * @create : 2020/07/17 09:20
 */
public class LeeCode437 {
    //给定一个二叉树，它的每个结点都存放着一个整数值。
    //
    //找出路径和等于给定数值的路径总数。
    //
    //路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
    //
    //二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
    public int pathSum(TreeNode root,int sum){
        return pathSum(root,sum,new int[1000],0);
    }
    public int pathSum(TreeNode root,int sum,int[]array,int p){
        if (root==null){
            return 0;
        }
        int temp = root.val;
        int n = root.val == sum?1:0;
        for (int i=p-1;i>=0;i--){
            temp+=array[i];
            if (temp==sum){
                n++;
            }
        }
        array[p] = root.val;
        int n1 = pathSum(root.left,sum,array,p+1);
        int n2 = pathSum(root.right,sum,array,p+1);
        return n+n1+n2;
    }
}
