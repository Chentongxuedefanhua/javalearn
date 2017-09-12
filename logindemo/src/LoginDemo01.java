/**
 * Created @ 2017-9-11.
 * Auther chenfan
 */
public class LoginDemo01 {

    public static void main(String args[]) {
        if(args.length !=2){
            System.out.println("输入参数不正确");
            System.exit(1);
        }
        String name = args[0];
        String passwd = args[1];
        if(name.equals("admin") && passwd.equals("admin")){
            System.out.println("欢迎");
        }
        else {
            System.out.println("错误，退出");
            System.exit(1);
        }
    }
}
