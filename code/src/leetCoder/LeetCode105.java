package leetCoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 从前序与中序遍历序列构造二叉树
 * @create : 2020/06/27 18:40
 */
public class LeetCode105 {
    //你可以假设树中没有重复的元素。
    //前序遍历 preorder = [3,9,20,15,7]
    //中序遍历 inorder = [9,3,15,20,7]
    public TreeNode buildTree1(int[] preorder,int[] inorder){
        int preLen = preorder.length;
        int inLen = inorder.length;
        if (preLen!=inLen){
            throw new RuntimeException("Incorrect input data.");
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <inLen ; i++) {
            map.put(inorder[i],i);
        }
        return buildTree(preorder,0,preLen-1,map,0,inLen-1);
    }

    private TreeNode buildTree(int[] preorder, int preLeft, int preRight, Map<Integer, Integer> map, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight)return null;
        int rootVal = preorder[preLeft];
        TreeNode root = new TreeNode(rootVal);
        int pIndex = map.get(rootVal);
        root.left = buildTree(preorder,preLeft+1,pIndex-inLeft+preLeft,map,inLeft,pIndex-1);
        root.right = buildTree(preorder,pIndex-inLeft+preLeft+1,preRight,map,pIndex+1,inRight);
        return root;
    }
}
