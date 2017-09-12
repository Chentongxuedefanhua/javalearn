/**
 * Created @ 2017-9-11.
 * Auther chenfan
 */

class Other{
    private String info = "hello world";
    private static String info2 = "hello world";
    class Inner{
        public void print(){
            System.out.println("inner"+info);
        }
    }
    public void fun(){
        new Inner().print();
    }
    static class Inner2{
        public void print(){
            System.out.println("inner2"+info2);
        }
    }

}
public class InnerClassDemo01 {

    public static void main(String args[]) {
        new Other().fun();
        new Other.Inner2().print(); //外部直接父类.内部类访问
        // Other.Inner in = new Other.Inner(); 此种就不行
        Other out = new Other();
        Other.Inner in = out.new Inner(); //不加static，用外部类实例化内部类
        Other.Inner2 in2 = new Other.Inner2(); //加上static，直接外部类.内部类实例化
        in.print();
        in2.print();
    }
}
