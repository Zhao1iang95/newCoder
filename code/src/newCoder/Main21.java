import java.util.Stack;

/**
 * @desc 栈的压入，弹出序列
 * @author zhaoliang
 * @date 20200506
 */
public class Main21 {
    //输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
    // 假设压入栈的所有数字均不相等。
    // 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
    // （注意：这两个序列的长度是相等的）
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0;//入栈序列的下标
        int popIndex = 0;//出栈序列的下标
        while (pushIndex < pushA.length){
            if (!stack.isEmpty() && stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex++;
            }else {
                stack.add(pushA[pushIndex]);
                pushIndex++;
            }
        }
        while (!stack.isEmpty()){
            if (stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex++;
            }else {
                return false;
            }
        }
        return true;
    }
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num :pushed){
            stack.add(num);
            while (!stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
