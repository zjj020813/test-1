package TEST;
import java.util.Scanner;
public class test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您设置的密码：");
        String password = sc.next();
        if(password.length()>=6)
        {
            boolean haveChar = false;
            boolean haveDig = false;
            boolean have_ = false;
            for(int i = 0;i<password.length();i++){
                char ch = password.charAt(i);
                if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                    haveChar = true;
                }
                else if(ch>='0'&&ch<='9'){
                    haveDig = true;
                }
                else if(ch=='_'){
                    have_ = true;
                }
                if(haveChar&&haveDig&&have_){
                    break;
                }
            }
            if(haveChar&&haveDig&&have_){
                System.out.println("密码设置成功！");
            }
            else{
                System.out.println("密码设置失败！");
            }
        }
        else{
            System.out.println("密码长度不足！！！");
        }
    }
}
