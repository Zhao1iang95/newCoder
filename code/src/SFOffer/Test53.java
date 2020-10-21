package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数字在升序数组中出现的次数
 * @create : 2020/10/04 09:11
 */
public class Test53 {
    //统计一个数字在升序数组中出现的次数。
    public int GetNumberOfK(int [] array,int k){
        int first = binarySearch(array,k);
        int last = binarySearch(array,k+1);
        return (first == array.length || array[first]!=k)?0:last-first;
    }
    private int binarySearch(int[] nums,int k){
        int l = 0,h = nums.length;
        while (l < h){
            int m = l + (h-l)/2;
            if(nums[m] >=k){
                h = m;
            }else {
                l = m+1;
            }
        }
        return l;
    }
}
