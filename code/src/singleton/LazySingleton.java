package singleton;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 懒汉式，类加载时才创建对象，不安全，效率低
 * @create : 2020/07/22 20:58
 */
public class LazySingleton {
    private LazySingleton(){}//私有构造器
    private static LazySingleton instance;//实例对象
    public static LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
