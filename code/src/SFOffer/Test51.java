package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数组中的逆序对
 * @create : 2020/10/04 08:26
 */
public class Test51 {
    //在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
    //输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
    private long cnt =0;
    private int[] tmp;//声明辅助数组
    public int InversePairs(int[] array){
        tmp = new int[array.length];
        mergeSort(array,0,array.length-1);
        return (int)(cnt % 1000000007);
    }

    private void mergeSort(int[] array, int l, int h) {
        if (h - l <1){
            return;
        }
        int m = l + (h-l)/2;
        mergeSort(array,l,m);
        mergeSort(array,m+1,h);
        merge(array,l,m,h);
    }

    private void merge(int[] array, int l, int m, int h) {
        int i=l,j=m+1,k =l;
        while (i <= m || j <=h){
            if (i >m){
                tmp[k] = array[j++];
            }else if(j >h){
                tmp[k] = array[i++];
            }else if(array[i] <=array[j]){
                tmp[k] = array[i++];
            }else {
                tmp[k] = array[j++];
                this.cnt+=m-i+1;
            }
            k++;
        }
        for(k = l;k<=h;k++){
        array[k] = tmp[k];
    }
    }

}
