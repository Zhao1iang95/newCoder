package singleton;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 静态内部类，同时解决饿汉式的内存浪费问题和懒汉式的线程安全问题。
 * @create : 2020/07/22 21:04
 */
public class StaticSingleton {
    private StaticSingleton(){}

    public static StaticSingleton getInstance(){
        return StaticClass.instance;
    }
    private static class StaticClass{
        private static final StaticSingleton instance = new StaticSingleton();
    }

}
