/**
 * Created @ 2017-9-7.
 * Auther chenfan
 */


public class RefDemo2 {

    public static void main(String args[]) {
        String str1 = "hello";
        System.out.println("before:" + str1);
        fun(str1);
        System.out.println("after:" + str1);
    }
    public static void  fun(String str2){
        str2 = "world";
    }
}
