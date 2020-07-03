package leetCoder;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 合并K个排序链表
 * @create : 2020/06/11 08:49
 */
public class LeetCode23 {
    //合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
    //1⃣️  每次O(K)，O(K) 比较 K个指针
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (true){
            ListNode minNode = null;
            int minPointer = -1;

            for (int i = 0; i <k ; i++) {
                if (lists[i]==null){
                    continue;
                }
                if (minNode==null || lists[i].val < minNode.val){
                    minNode = lists[i];
                    minPointer = i;
                }
            }
            if (minPointer == -1){
                break;
            }
            tail.next = minNode;
            tail = tail.next;
            lists[minPointer] = lists[minPointer].next;
        }
        return dummyHead.next;
    }
    //2⃣️ 小根堆，优先队列
    public ListNode mergeKLists2(ListNode[] lists) {
        Queue<ListNode> pq = new PriorityQueue<>((v1,v2)->v1.val - v2.val);

        for (ListNode node:lists) {
            if (node!=null){
                pq.offer(node);
            }
        }
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (!pq.isEmpty()){
            ListNode minNode = pq.poll();
            tail.next = minNode;
            tail = minNode;
            if (minNode.next !=null){
                pq.offer(minNode.next);
            }
        }
        return dummyHead.next;
    }
}
