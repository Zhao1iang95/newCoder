package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 键值映射
 * @create : 2020/07/29 15:28
 */
public class LeetCode677 {
    //实现一个 MapSum 类里的两个方法，insert 和 sum。
    //对于方法 insert，你将得到一对（字符串，整数）的键值对。字符串表示键，整数表示值。如果键已经存在，那么原来的键值对将被替代成新的键值对。
    //对于方法 sum，你将得到一个表示前缀的字符串，你需要返回所有以该前缀开头的键的值的总和。
    private class Node{
        Node[] child = new Node[26];
        int  value;
    }
    private Node root = new Node();
    public  LeetCode677(){}

    public void insert(String key,int val){
        insert(key,root,val);
    }
    private void insert(String key,Node node,int val){
        if (node==null){
            return;
        }
        if(key.length()==0){
            node.value = val;
            return;
        }
        int index = indexForChar(key.charAt(0));
        if(node.child[index]==null){
            node.child[index] = new Node();
        }
        insert(key.substring(1),node.child[index],val);
    }

    private int indexForChar(char charAt) {
        return charAt -'a';
    }

    public int sum(String prefix) {
        return sum(prefix,root);
    }
    private int sum(String prefix,Node node){
        if(node==null)return 0;
        if (prefix.length()!=0){
            int index = indexForChar(prefix.charAt(0));
            return sum(prefix.substring(1),node.child[index]);
        }
        int sum = node.value;
        for (Node child:node.child) {
            sum+=sum(prefix,child);
        }
        return sum;
    }
    }
