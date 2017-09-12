/**
 * Created @ 2017-9-7.
 * Auther chenfan
 */
//引用传递
class Demo {
    int temp = 30;
}
public class RefDemo {

    public static void main(String args[]) {
        Demo d1 = new Demo();
        d1.temp = 50;
        System.out.println("before fun:" + d1.temp);
        fun(d1);
        System.out.println("after fun:" + d1.temp);
    }
    public static void fun(Demo d2) {
        d2.temp = 100;
    }
}
