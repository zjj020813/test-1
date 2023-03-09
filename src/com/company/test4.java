package com.company;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args){
        int i,score;
        double avg=0,sum=0;
        Scanner sc=new Scanner(System.in);
        for( i=1;i<6;i++){
            System.out.println("请输入第"+ i +"门课的成绩：");
             score=sc.nextInt();
             if(score>0){
                 sum=sum+score;
                 System.out.println(sum);
             }
             else{
                 System.out.println("录入错误");
                 break;
             }
            avg=sum/i;
        }

        System.out.println(avg);
    }
}
