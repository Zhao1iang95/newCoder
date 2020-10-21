package leetCodeGroup.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 寻找二叉树中出现次数最多的值
 * @create : 2020/07/28 09:50
 */
public class LeetCode501 {
    //给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
    //假定 BST 有如下定义：
    //结点左子树中所含结点的值小于等于当前结点的值
    //结点右子树中所含结点的值大于等于当前结点的值
    //左子树和右子树都是二叉搜索树
    private int curCnt = 1;
    private int maxCnt = 1;
    TreeNode preNode = null;
    public int[] findMode(TreeNode root){
        List<Integer> maxCntNums = new ArrayList<>();
        inOrder(root,maxCntNums);
        int [] ret = new int[maxCntNums.size()];
        int idx =0;
        for (int num:maxCntNums) {
            ret[idx++] = num;
        }
        return ret;
    }

    private void inOrder(TreeNode root, List<Integer> nums) {
        if (root==null)return;
        inOrder(root.left,nums);
        if (preNode!=null){
            if (preNode.val==root.val) {
                curCnt++;
            }else {
                curCnt=1;
            }
            }
        if (curCnt>maxCnt){
            maxCnt = curCnt;
            nums.clear();
            nums.add(root.val);
        }else if(curCnt==maxCnt){
            nums.add(root.val);
        }
        preNode = root;
        inOrder(root.right,nums);
        }
    }
