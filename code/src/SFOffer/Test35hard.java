package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 复杂链表的复制
 * @create : 2020/09/28 14:57
 */
public class Test35hard {
    //输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点）
    //请对此链表进行深拷贝，并返回拷贝后的头结点。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空
    public RandomListNode Clone(RandomListNode pHead){
        if (pHead==null)return null;
        //插入新节点
        RandomListNode cur = pHead;
        while (cur!=null){
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = clone.next;
        }
        //建立random链接
        cur = pHead;
        while (cur!=null){
            RandomListNode clone = cur.next;
            if (cur.random!=null)
                clone.random = cur.random.next;
            cur = clone.next;
        }
        //拆分
        cur = pHead;
        RandomListNode pCloneHead = pHead.next;
        while (cur.next!=null){
            RandomListNode next = cur.next;
            cur.next = next.next;
            cur = next;
        }
        return pCloneHead;
    }
}
