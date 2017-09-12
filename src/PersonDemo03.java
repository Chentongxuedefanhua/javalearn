/**
 * Created @ 2017-9-7.
 * Auther chenfan
 */

//构造法方法
class Person03 {
    public Person03() {
        System.out.println("新的Person....");
    }
}

public class PersonDemo03 {
    public static void main(String args[]) {
        Person03 per = null; //声明对象并不执行构造方法
        per = new Person03(); //实例化时才调用构造方法
    }
}
