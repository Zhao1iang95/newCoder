package HFrequency;

public class NC88 {
    //有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
    //
    //给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
    public class Finder{
        public int findKth(int[] a  ,int n,int K){
           return  help(0,n-1,a,K);
        }

        private int help(int left, int right, int[] a, int k) {
            int m = partition(left,right,a);
            if(m+1 > k){
                return help(left,m-1,a,k);
            }else if(m+1 <k){
                return help(m+1,right,a,k);
            }else {
                return a[m];
            }

        }

        private int partition(int left, int right, int[] a) {
            int pivoValue = a[left];
            while(left < right){
                while (left < right && a[right] <= pivoValue){
                    right--;
                }
                a[left] = a[right];
                while(left < right && a[left] >= pivoValue){
                    left++;
                }
                a[right] = a[left];
            }
            a[left] = pivoValue;
            return left;
        }
    }
}
