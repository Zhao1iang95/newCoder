package leetCodeGroup.twolookup;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 寻找旋转排序数组中的最小值
 * @create : 2020/08/24 14:30
 */
public class LeetCode153 {
    //假设按照升序排序的数组在预先未知的某个点上进行了旋转。
    //( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
    //请找出其中最小的元素。
    //你可以假设数组中不存在重复元素。
    public int findMin(int[] nums){
        int l=0,h = nums.length;
        while (l<h){
            int mid = l + (h -l)/2;
            if(nums[mid]<=nums[h]){
                h = mid;
            }else {
                l = mid+1;
            }
        }
        return nums[l];
    }
}
