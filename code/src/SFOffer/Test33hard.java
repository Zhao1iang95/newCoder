package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉搜索树的后序遍历
 * @create : 2020/09/28 09:22
 */
public class Test33hard {
    //输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
    //如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。。
    public boolean VerifySquenceOfBST(int[] sequence){
        if (sequence == null || sequence.length==0){
            return false;
        }
        return verify(sequence,0,sequence.length -1);
    }

    private boolean verify(int[] sequence, int start, int end) {
        if (end - start <=1){
            return true;
        }
        int rootVal = sequence[end];
        int cutIndex = start;
        while (cutIndex < end && sequence[cutIndex] <= rootVal){
            cutIndex++;
        }
        for (int i = cutIndex; i <end ; i++) {
            if (sequence[i] < rootVal){
                return false;
            }
        }
        return verify(sequence,start,cutIndex -1) && verify(sequence,cutIndex,end-1);
    }
}
