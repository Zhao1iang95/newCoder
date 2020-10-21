package SFOffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数据流中第一个不重复的字符
 * @create : 2020/09/30 08:24
 */
public class Test41II {
    //请实现一个函数用来找出字符流中第一个只出现一次的字符。
    //例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
    //当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
    private int[] cnts = new int[256];
    private Queue<Character> queue = new LinkedList<>();
    public void Insert(char ch){
    cnts[ch]++;
    queue.add(ch);
    while (!queue.isEmpty() && cnts[queue.peek()] >1){
        queue.poll();
    }
    }
    public char FirstAppearingOnce(){
        return queue.isEmpty()?'#':queue.peek();
    }
}
