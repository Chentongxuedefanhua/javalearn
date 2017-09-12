/**
 * Created @ 2017-9-7.
 * Auther chenfan
 */
class Person04 {

    private String name;
    private int age;
    //构造方法重载
    public Person04() { //声明无参的构造方法

    }
    public  Person04(String n) { //声明一个参数的构造方法
        name = n;
    }
    public Person04(String n,int a){
        this.name = n;
        this.age = a;
    }
    public void setName(String n){
        name = n;
    }

    public void setAge(int a) {
        if(a>=0 && a<=150)
            age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void tell() {
        System.out.println("name:" + getName() + "----" + "age:" + getAge());
    }

}

public class PersonDemo04 {
    public static void main(String args[]) {
        Person04 per = new Person04("Tom",22);
        Person04 per2 = new Person04("Tom");
        per.tell();
        per2.tell();
        new Person04("Jerry").tell(); //匿名对象
    }
}
