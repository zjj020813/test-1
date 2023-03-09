package TEST;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args){
        int []a=new int[30];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<30;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for (int i=1;i<30;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        int min=a[0];
        for (int i=1;i<30;i++){
            if (min>a[i]){
                min=a[i];
            }
        }
        double avg=0;
        for (int i=0;i<30;i++){
            avg=avg+a[i];
        }
        avg=avg/30;
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }
}
