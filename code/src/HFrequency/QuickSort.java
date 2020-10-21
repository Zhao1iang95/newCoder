package HFrequency;

public class QuickSort {
   private static int[] numbers = {0,3,2,4,6,5};
    public static void sort(int[] numbers){
        if(numbers.length>0){
            quickSort(numbers,0,numbers.length-1);
        }
    }

    private static void quickSort(int[] numbers, int low, int height) {
        if(low < height){
            int mid = getMid(numbers,low,height);
            quickSort(numbers,0,mid);
            quickSort(numbers,mid+1,height);
        }
    }

    private static int getMid(int[] numbers, int low, int height) {
        int temp = numbers[low];
        while(low < height){
            while(low < height && numbers[height] >= temp){
                height--;
            }
            numbers[low] = numbers[height];
            while(low < height && numbers[low] < temp){
                low++;
            }
            numbers[height] = numbers[low];
        }
        numbers[low] = temp;
        return low;
    }
    public static void main(String args[]){
        sort(numbers);
        for (int val:numbers
             ) {
            System.out.println(val);
        }

    }

}
