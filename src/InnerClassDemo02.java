/**
 * Created @ 2017-9-11.
 * Auther chenfan
 */

class Other02{
    private String info = "hello world";
    public void fun2(final int temp){
        class Inner3{
            public void print(){
                System.out.println("inner3"+info);
                System.out.println(temp);
            }
        }
        new Inner3().print(); //实例化
    }
}

public class InnerClassDemo02 {

    public static void main(String args[]) {
        new Other02().fun2(30);
    }
}
