/**
 * Created @ 2017-9-11.
 * Auther chenfan
 */

class Check{  //完成验证操作
    public boolean validate(String name, String passwd){
        if(name.equals("admin") && passwd.equals("admin")){
            return true;
        }
        else {
            return false;
        }
    }
}

class Operate{
    private String info[];
    private String str = "";
    public Operate(String info[]){ //构造方法需要传入一个数组
        this.info = info;
    }
    public String login(){
        Check check = new Check();
        this.isExit();
        String name = this.info[0];
        String passwd = this.info[1];
        if(check.validate(name,passwd)){
            str = "欢迎";
            return str;
        }
        else {
            str = "错误";
            return str;
        }

    }
    public void isExit(){
        if(this.info.length != 2){
            System.out.println("输入参数不正确");
            System.exit(1);
        }
    }
}

public class LoginDemo02 {

    public static void main(String args[]) {
        Operate opt = new Operate(args);
        System.out.println(opt.login());
    }
}

