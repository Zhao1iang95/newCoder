package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 寻找两个正序数组的中位数
 * @create : 2020/05/28 10:55
 */
public class LeetCode4_hard {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n){
            return findMedianSortedArrays(nums2,nums1);//保证m <=n;
        }
        int iMin = 0,iMax = m;
        while (iMin <= iMax){
            int i = (iMax + iMin) /2;
            int j = (m + n +1) /2 -i;
            if (j !=0 && i !=m && nums2[j-1]>nums1[i]){ //i需要增大
                iMin = i + 1;
            }else if (i != 0 && j !=n && nums1[i -1] > nums2[j]){//i需要减小
                iMax = i -1;
            } else { //达到要求，并且将边界条件列出来单独考虑
                int maxLeft =0;
                if (i ==0 ){
                    maxLeft = nums2[j -1];
                }else if (j ==0){
                    maxLeft = nums1[i -1];
                }else {
                    maxLeft = Math.max(nums1[i-1],nums2[j-1]);
                }
                if ((m + n) % 2 ==1){//奇数不需要考虑右半部分
                    return maxLeft;
                }
                int minRight = 0;
                if (i == m){
                    minRight = nums2[j];
                }else if (j == n){
                    minRight = nums1[i];
                }else {
                    minRight = Math.min(nums2[j] ,nums1[i]);
                }
                return (maxLeft + minRight) /2.0;
            }
        }
        return 0.0;
    }
}
