import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created @ 2017-9-7.
 * Auther chenfan
 */
public class StringDemo {

    public static void main(String args[]) {
        String str1 = "Tom";
        String str4 = "Tom";
        String str2  = new String("Tom");
        String str3 = str2;
        System.out.println(str1 == str2); //false
        System.out.println(str1 == str4); //true
        System.out.println(str3 == str2); //true
        System.out.println(str1.equals(str2)); //true
    }
}
