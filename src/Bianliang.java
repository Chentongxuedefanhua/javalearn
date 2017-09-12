import java.util.Date;
import java.util.Scanner;

/**
 * Created @ 2017-9-6.
 * Auther chenfan
 */
public class Bianliang {
    public static void main(String args[]) {
        int a = 4;
        double b = Math.sqrt(a);
        int c = 300;
        byte d = (byte) c; //44
        String s = null;
        String sa = "";
        if (s == null)
            System.out.println("null error");
        if (sa.length() == 0)
            System.out.println("length error");
        System.out.println(d);
        System.out.println(a*b);
        System.out.printf("%1$tF %1$tT", new Date());

        System.out.println("what's your name:");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println(name);

    }
}
