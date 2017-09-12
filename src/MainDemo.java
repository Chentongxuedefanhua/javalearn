import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created @ 2017-9-8.
 * Auther chenfan
 */
public class MainDemo {

    public static void main(String args[]) {
        /**
        * public 可以被外部调用
        * static 此方法可以由类名直接调用
         * void main方法的起点，不需要任何返回值
         * mian 系统调用的入口
         * String args[] 运行时输入的参数
         *     java 类名 参数1，参数2， 。。。。
        * */
        fun();
        //fun2(); 错误
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }

    }
    public static void fun(){ //可以被主方法调用
        System.out.println("hello");
    }
    public  void fun2(){ //不能被主方法调用
        System.out.println("hello");
    }
}
