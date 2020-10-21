package singleton;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 饿汉式，类加载时就创建实例，线程安全
 * @create : 2020/07/22 20:52
 */
public class HungrySingleton {
    private HungrySingleton(){}//私有构造器
    private static HungrySingleton instance = new HungrySingleton();//私有静态变量存储实例
    public static HungrySingleton getInstance(){ //对外提供静态公有方法获取实例
        return instance;
    }
}
