/**
 * Created @ 2017-9-7.
 * Auther chenfan
 */
class Person {

    String name;
    int age;

    public void tell(){
        System.out.println("name:" + name + "," + "age:" + age);
    }
}
public class PersonDemo {
    public static void main(String args[]) {
        Person per = null;
        per = new Person();
        per.name = "Tom";
        per.age = 22;
        Person per1 = per;
        per1.name = "Jerry"; //per 与per1 指向相同的2个栈空间，但是指向同一个堆空间，故数据更改是相同的
        per.tell();
    }
}
