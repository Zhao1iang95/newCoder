import java.util.ArrayList;

/**
 * @author zhaoliang
 * @date 20200409
 * @desc: 最小的k个数
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Main40 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k>input.length || k==0){
            return new ArrayList<>();
        }

        //创建k个数的大顶堆,用数组模拟堆
        int [] a = new int[k];
        //初始化堆中元素
        System.arraycopy(input, 0, a, 0, k);

        //维护大顶堆，非叶子结点下标=k/2-1；-->堆的初始化
        for(int i = k/2-1;i>=0;k--){
            //i就是我们要维护的堆的节点下标
            initiate(i,a,k);
        }
        //去遍历剩余的len-k个节点
        for(int i = k;i<input.length;i++){
            if(input[i]<a[0]){
                //当前位置的值小于大顶堆堆顶的位置的值
                a[0] = input[i];
                initiate(0,a,k);
            }
        }
        //将大顶堆中的节点元素进行升序操作,将堆顶元素与最后一位交换，再维护堆，但上一次的堆尾不参与；
        for(int i= a.length -1;i>0;i--){
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            initiate(0,a,i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x: a){
            ans.add(x);
        }
        return  ans;
    }

    /**
     *  初始化堆的函数，其实就是维护每一个节点的函数
     * @param index 维护当前堆的下标
     * @param a 数组->堆
     * @param length 堆的节点个数
     */
    private void initiate(int index, int[] a, int length) {
        int temp = a[index];
        for(int k = index*2+1;k<length;k= k*2+1){
            if((k+1)<length && a[k+1] > a[k]){
                //取出当前左右孩子的节点值最大的节点
                k++;
            }
            if(a[k]>temp){
                a[index] = a[k];
                //更新index的值，index代表temp数字最终在堆中的位置，k= k*2+1执行后，index和k的关系就是父子节点的关系
                index = k;
            }else {
                //由于我们是从下往上维护的
                break;
            }
        }
        // 所在的位置进行更新
        a[index] = temp;

    }
}
