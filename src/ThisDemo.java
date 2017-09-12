import javax.swing.plaf.synth.SynthUI;

/**
 * Created @ 2017-9-8.
 * Auther chenfan
 */

class Person05 {
    private String name;
    private int age;
    public Person05() {
        System.out.println("这是一个构造方法");
    }
    public Person05(String name){
        this(); //调用无参构造，调用方法方法放在首行
        this.name  = name;
    }
    public Person05(String name, int age){
        this(name); //调用只有一个参数的构造方法
        this.age = age;
    }
    public boolean compare(Person05 per){
        Person05 p1 = this; //当前对象
        Person05 p2 = per; //传入对象
        if(p1 == p2) //地址相等，两个对象相等
            return true;
        if(p2.name.equals(p1.name) && p2.age == p1.age) //内容相等，对象相等
            return true;
        else
            return false;
    }
    public  String getInfo(){
        return "姓名：" + this.name + "  年龄：" + this.age + this;
    }
}
public class ThisDemo {

    public static void main(String args[]) {
        Person05 per = new Person05("Tom",22);
        Person05 per2 = new Person05("Jerry",22);
        System.out.println(per.getInfo()); //this->Person05@4554617c
        System.out.println(per2.getInfo()); //this->Person05@74a14482   调用方法的对象不同
        System.out.println(per.compare(per2));
    }
}
