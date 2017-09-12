import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.security.Signature;

/**
 * Created @ 2017-9-8.
 * Auther chenfan
 */
//单例模式 构造方法私有化，限制实例化对象的产生，在类的内部产生实例化对象，通过类的静态方法返回类的实例化，实例引用同一个对象

class Singleton{
    private Singleton(){ //私有化构造方法

    }
    //static Singleton instance = new Singleton(); //内部实例化,static给外部通过类名称调用
    private static Singleton instance = new Singleton(); //封装，通过getInstance pubblic方法获取
    public static Singleton getInstance(){
        return instance;
    }
    public void print(){
        System.out.println("hello");
    }
}

public class SingLetonDemo {

    public static void main(String args[]) {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        s.print(); //都调用了一个实例化对象    单例模式
        s2.print();
        s3.print();
    }
}
