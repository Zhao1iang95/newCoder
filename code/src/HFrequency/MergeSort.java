package HFrequency;

public class MergeSort {
    //归并排序，把待排序序列分成若干个子序列，各子序列有序。再合并
    public static int[] sort(int[] numbers,int low,int height){
//        int low = 0,height = numbers.length-1;
        int mid = (low+height)/2;
        if(low < height){
            sort(numbers,low,mid);
            sort(numbers,mid+1,height);
            merge(numbers,low,mid,height);
        }
        return numbers;
    }

    private static void merge(int[] numbers, int low, int mid, int height) {
        int [] temp = new int[height-low+1];
        int i = low;
        int j = mid+1;
        int k=0;
        //较小得数移动到新数组
        while(i <= mid && j <= height){
            if(numbers[i] < numbers[j]){
                temp[k++] = numbers[i++];
            }else {
                temp[k++] = numbers[j++];
            }
        }
        //左边剩余数移动到数组
        while (i <= mid){
            temp[k++] = numbers[i++];
        }
        //右边剩余数移动到数组
        while (j <= height){
            temp[k++] = numbers[j++];
        }
        //新数组覆盖原数组
        for (int k2 = 0; k2 <temp.length ; k2++) {
            numbers[k2+low] = temp[k2];
        }
    }
    public static void main(String args[]){
        int[] numbers = {1,3,4,2,6,5,8,7};
        int low =0,height = numbers.length-1;
        int[] array = sort(numbers,low,height);
        for (int val:array
             ) {
            System.out.println(val);
        }

    }

}
