/**
 * Created @ 2017-9-8.
 * Auther chenfan
 */

class Person08{
    private String name;
    public Person08(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class ObjectArrayDemo {

    public static void main(String args[]) {
        Person08 per[] = new Person08[3];
        per[0] = new Person08("Tom");
        per[1] = new Person08("Jerry");
        per[2] = new Person08("Jack");
        Person08 per2[] = {new Person08("test")};
    }
}
