package TEST;

import java.util.Scanner;

public class test21 {

    public  static int F(int a){

        if (a==0) return 0;
        else if(a==1) return 1;
        return F(a-1)+F(a-2);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
                int c= sc.nextInt();
        F(c);
        int b=F(c);
        System.out.println(b);
    }
}
