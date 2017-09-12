/**
 * Created @ 2017-9-8.
 * Auther chenfan
 */

class Person07{
    private String name;
    private int age;
    //static String country = "A城";
    private static String country = "A城"; //属性封装
    public  static void setCountry(String c){ //此方法可以由类名称直接调用
        country = c;
    }
    public static String getCountry(){
        return country;
    }
    public Person07(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("name:" + this.name + "  " + "age:" + this.age + "  " + "city:" + this.country);
    }
}

public class StaticDemo2 {

    public static void main(String args[]) {
        Person07.setCountry("C城"); //对象实例化前就能调用
        Person07 per1 = new Person07("Tom", 22);
        Person07 per2 = new Person07("Jerry", 22);
        Person07 per3 = new Person07("Jack", 22);
        System.out.println("==========修改城市前=============");
        per1.info();//name:Tom  age:22  city:A城
        per2.info();//name:Jerry  age:22  city:A城
        per3.info();//name:Jack  age:22  city:A城
        System.out.println("==========修改城市后=============");
        //per1.country = "B城";
        Person07.setCountry("B城");//static属性字段可以直接用类名称调用
        per1.info();  //name:Tom  age:22  city:B城    全部输出为B城
        per2.info();//name:Jerry  age:22  city:B城
        per3.info();//name:Jack  age:22  city:B城
    }
}
