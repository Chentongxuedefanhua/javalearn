/**
 * Created @ 2017-9-7.
 * Auther chenfan
 */
class Person02 {

    private String name;
    private int age;

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



    public void tell(){
        System.out.println("name:" + getName() + "," + "age:" + getAge());
    }
}

public class PersonDemo02 {
    public static void main(String args[]) {
        Person02 per = new Person02();
        per.setName("Tom");
        per.setAge(-22);
        per.tell();
    }
}
