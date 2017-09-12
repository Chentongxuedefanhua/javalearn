/**
 * Created @ 2017-9-8.
 * Auther chenfan
 */

class Person06{
    private String name;
    private int age;
    static String country = "A城";
    public Person06(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("name:" + this.name + "  " + "age:" + this.age + "  " + "city:" + this.country);
    }
}

public class StaticDemo {

    public static void main(String args[]) {
        Person06 per1 = new Person06("Tom", 22);
        Person06 per2 = new Person06("Jerry", 22);
        Person06 per3 = new Person06("Jack", 22);
        System.out.println("==========修改城市前=============");
        per1.info();//name:Tom  age:22  city:A城
        per2.info();//name:Jerry  age:22  city:A城
        per3.info();//name:Jack  age:22  city:A城
        System.out.println("==========修改城市后=============");
        //per1.country = "B城";
        Person06.country = "B城"; //static属性字段可以直接用类名称调用
        per1.info();  //name:Tom  age:22  city:B城    全部输出为B城
        per2.info();//name:Jerry  age:22  city:B城
        per3.info();//name:Jack  age:22  city:B城
    }
}
