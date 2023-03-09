package TEST;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args){
        int i=0;
        int random = (int) (Math.random()*101);
        //System.out.println(random);
        Scanner sc=new Scanner(System.in);
       for(int j=1;j<=101;j++){
           i=sc.nextInt();
           if(i>random){
               System.out.println("偏大");
           }
           else if(i<random){
               System.out.println("偏小");
           }
           else{
               System.out.println("猜对了");
               break;
           }
       }

    }

}
