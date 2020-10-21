package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 实现Trie（前缀树）
 * @create : 2020/07/29 14:29
 */
public class LeetCode208 {
    //实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
    private class Node{
        Node[] childs = new Node[26];
        boolean isLeaf;
    }
    private Node root = new Node();
    public LeetCode208(){
    }
    public void insert(String word){
        insert(word,root);
    }
    private void insert(String word,Node node){
        if(node==null)return;
        if(word.length()==0){
            node.isLeaf = true;
            return;
        }
        int index = indexForChar(word.charAt(0));
        if (node.childs[index]==null){
            node.childs[index] = new Node();
        }
        insert(word.substring(1),node.childs[index]);
    }

    private int indexForChar(char c) {
        return c -'a';
    }

    public boolean search(String word){
        return search(word,root);
    }
    private boolean search(String word,Node node){
        if (node==null)return false;
        if (word.length()==0)return node.isLeaf;
        int index = indexForChar(word.charAt(0));
        return search(word.substring(1),node.childs[index]);
    }
    public boolean startsWith(String prefix){
        return startsWith(prefix,root);
    }
    private boolean startsWith(String prefix,Node node){
        if(node==null)return false;
        if (prefix.length()==0)return true;
        int index = indexForChar(prefix.charAt(0));
        return startsWith(prefix.substring(1),node.childs[index]);
    }
}
