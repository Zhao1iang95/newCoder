import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhaoliang
 * @desc 二叉树中和为某一值的路径
 * @date 20200508
 */
public class Main24 {
    //输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
    // 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
    private ArrayList<ArrayList<Integer>> ans;

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        solve(root, target, 0, list);

        return ans;
    }

    /**
     * @param node   当前节点
     * @param target 目标值
     * @param sum    当前路径和
     * @param list   保存当前路径
     */
    private void solve(TreeNode node, int target, int sum, ArrayList<Integer> list) {
        if (node != null) {
            sum += node.val;
            list.add(node.val);
            if (node.left == null && node.right == null) {
                if (sum == target) {
                    ArrayList<Integer> res = new ArrayList<>(list);
                }
            } else {
                solve(node.left, target, sum, list);
                solve(node.right, target, sum, list);
            }
            list.remove(list.size() - 1);
        }
    }
    //
    private ArrayList<ArrayList<Integer>> res;
    private ArrayList<Integer> path;
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        res = new ArrayList<>();
        path = new ArrayList<>();
        recur(root,sum);
//        change();
        return res;
    }

//    private void change() {
//        for (int i = 0;i<res.size();i++){
//            int index = i;
//            for (int j=i+1;j<res.size();j++){
//                if (res.get(j).size() > res.get(index).size()){
//                    index =j;
//                }
//            }
//            if (i!=index){
//                ArrayList<Integer> temp  =res.get(i);
//                res.set(i,res.get(index));
//                res.set(index,temp);
//            }
//        }
//    }

    private void recur(TreeNode node, int sum) {
        if (node==null) return;
        path.add(node.val);
        sum-=node.val;
        if (sum==0 && node.left==null && node.right == null){
            res.add(new ArrayList<>(path));
        }
        recur(node.left,sum);
        recur(node.right,sum);
        path.remove(path.size()-1);
    }
}
//    LinkedList<List<Integer>> res = new LinkedList<>();
//    LinkedList<Integer> path = new LinkedList<>();
//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
//        recur(root, sum);
//        return res;
//    }
//    void recur(TreeNode root, int tar) {
//        if(root == null) return;
//        path.add(root.val);
//        tar -= root.val;
//        if(tar == 0 && root.left == null && root.right == null)
//            res.add(new LinkedList(path));
//        recur(root.left, tar);
//        recur(root.right, tar);
//        path.removeLast();
//    }