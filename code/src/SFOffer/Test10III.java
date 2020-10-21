package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 跳台阶
 * @create : 2020/09/22 10:31
 */
public class Test10III {
    public int JumpFloor(int target) {
        if(target<=2)return target;
        int f1=1,f2=2,fib=0;
        for(int i = 3;i<=target;i++){
            fib = f1+f2;
            f1 = f2;
            f2 = fib;
        }
        return fib;
    }
}
