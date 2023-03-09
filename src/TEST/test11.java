package TEST;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args){
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if (min>a[i]){
                min=a[i];
            }
        }
        double avg=0;
        for (int i=0;i<a.length;i++){
            avg=avg+a[i];
        }
        avg=(avg-max-min)/8;
        System.out.println(avg);
    }
}
