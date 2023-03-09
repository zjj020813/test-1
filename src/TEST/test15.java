package TEST;
import  java.util.Scanner;
public class test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(h(s)){
            System.out.println("是回文字符");
        }
        else{
            System.out.println("不是回文字符");
        }
    }
    public static boolean h(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-1-i))
            {
                return true;
            }
            else {
                break;
            }
        }
        return false;
    }
}