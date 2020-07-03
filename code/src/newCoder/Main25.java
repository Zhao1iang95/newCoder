import java.util.HashMap;
import java.util.Map;

/**
 * @desc 复杂链表的复制
 * @author zhaoliang
 * @date 20200509
 */
public class Main25 {
    //输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
    // 另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，并返回拷贝后的头结点。
    // （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空
    public RandomListNode Clone(RandomListNode pHead)
    {
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode removeNode = pHead;
        while (removeNode!=null){//原链表和新链表
            RandomListNode node = new RandomListNode(removeNode.label);
            map.put(removeNode,node);
            removeNode = removeNode.next;
        }
        removeNode = pHead;
        while (removeNode!=null){
            RandomListNode node = map.get(removeNode);
            node.next = map.get(removeNode.next);
            node.random = map.get(removeNode.random);
            removeNode = removeNode.next;
        }
        return map.getOrDefault(pHead,null);
    }
    //方法2，将On复杂度降低
    public RandomListNode Clone2(RandomListNode pHead)
    {
        if (pHead == null){
            return null;
        }
        //创建新的链表节点插入到原链表中
        RandomListNode removeNode = pHead;
        while (removeNode != null){
            RandomListNode temp = removeNode.next;
            RandomListNode node = new RandomListNode(removeNode.label);
            removeNode.next = node;//原节点指向新节点
            node.next = temp;
            removeNode = temp;
        }
        //创建random节点指向
            removeNode = pHead;
        while (removeNode!=null){
            removeNode.next.random = removeNode.random == null ? null:removeNode.random.next;
            removeNode = removeNode.next.next;//用两个next把新链表跳过
        }
        //链表分割
        removeNode = pHead;
        RandomListNode cloneHead = pHead.next;
        while (removeNode!=null){
            RandomListNode node =removeNode.next;
            removeNode.next = node.next;//原链表中节点之间关系的维护
            node.next = node.next ==null?null:node.next.next;
            removeNode = removeNode.next;
        }
        return cloneHead;
    }
}
