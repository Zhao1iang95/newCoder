package HFrequency;

public class HalfSort {
    //请实现有重复数字的有序数组的二分查找。
    //输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
    public int upper_bound_(int n,int v,int[] a){
        //n数组长度
        //v查找值
        if(v > a[n-1]){
            return n+1;
        }
        int low =0,height=n;
        while(low < height){
            int mid = low + (height-low)/2;
            if(a[mid] < v){
                low = mid+1;
            }else{
                height = mid;
            }
        }
        return low +1;
    }
}
