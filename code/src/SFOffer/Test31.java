package SFOffer;

import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 栈的压入、弹出序列
 * @create : 2020/09/28 07:55
 */
public class Test31 {
    //输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
    //假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
    //但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
    public boolean IsPopOrder(int[] pushA,int[] popA){
        int n = pushA.length;
        Stack<Integer> stack = new Stack<>();
        for (int pushIndex = 0,popIndex = 0; pushIndex <n ; pushIndex++) {
            stack.push(pushA[pushIndex]);
            while (popIndex<n && !stack.isEmpty() && stack.peek()==popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
