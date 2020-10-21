package singleton;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 双重检查锁，使用 volatile 以及多重检查来减小锁范围，提升效率。
 * @create : 2020/07/22 21:00
 */
public class DoubleCheckSingleton {
    private DoubleCheckSingleton(){}
    private volatile static DoubleCheckSingleton instance;
    public static DoubleCheckSingleton getInstance(){
        if(instance==null){
            synchronized(DoubleCheckSingleton.class){
                if (instance==null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
