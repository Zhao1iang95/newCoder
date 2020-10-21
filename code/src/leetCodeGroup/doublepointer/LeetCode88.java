package leetCodeGroup.doublepointer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 合并两个有序数组
 * @create : 2020/08/13 11:10
 */
public class LeetCode88 {
    //给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
    //需要从尾开始遍历，否则在 nums1 上归并得到的值会覆盖还未进行归并比较的值。
    public void  merge(int[] nums1,int m,int[]nums2,int n){
        int index1 = m-1;int index2 = n -1;
        int indexMerge = m+n-1;
        while (index1>=0 || index2>=0){
            if (index1<0){
                nums1[indexMerge--] =nums2[index2--];
            }else if(index2<0){
                nums1[indexMerge--] = nums1[index1--];
            }else if(nums1[index1] >nums2[index2]){
                nums1[indexMerge--] = nums1[index1--];
            }else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }
}
