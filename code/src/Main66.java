/**
 * @desc 构建乘积数组
 * @author zhaoliang
 * @date 20200422
 */
public class Main66 {
    //给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，
    //其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
    public int[] multiply(int[] A) {

        if (A==null || A.length == 0){
            return new int[0];
        }
        int[] f1 = new int[A.length];//从0 ～ i-1项的乘积
        int[] f2 = new int[A.length];//i+1 ～ n-1的乘积
        int ans1 = 1;//0~i - 1的乘积
        int ans2 = 1;//i + 1～n - 1的乘积
        for (int i = 0,j = A.length -1; i <A.length; i++,j--){

            f1[i] = ans1;
            ans1 *=A[i];

            f2[j] = ans2;
            ans2 *= A[j];
        }
        int[] B = new int[A.length];
        for (int i = 0; i<A.length; i++){
            B[i] = f1[i] * f2[i];
        }
        return B;
    }
}
