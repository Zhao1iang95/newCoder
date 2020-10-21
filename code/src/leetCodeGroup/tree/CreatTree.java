package leetCodeGroup.tree;

import java.util.Scanner;
public class CreatTree {

    Scanner in=new Scanner(System.in);
    public CreatTree() {
    }
    class Node{
        Node left; //指向左孩子
        Node right; //指向右孩子
        int data;  //数据域
        Node(){
        }
    }
    public Node Create() {
        int a=in.nextInt();
        if(a==-1) {
            return null;
        }else {
            Node head=new Node();
            head.data=a;
            head.left=Create();
            head.right=Create();
            return head;
        }
    }

    public static void main(String[] args) {
        CreatTree tree=new CreatTree();
        Node head;
        head=tree.Create();
    }
}

