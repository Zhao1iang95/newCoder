package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : feibonaci
 * @create : 2020/06/16 20:50
 */
public class test {
    public static int fibonaci(int sum ){
        if (sum == 1 || sum == 2){
            return 1;
        }else {
            return fibonaci(sum-2) +fibonaci(sum-1);

        }
    }

    public static void main(String[] args) {
    System.out.println( fibonaci(20));
    }
}
