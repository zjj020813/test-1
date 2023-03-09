package TEST;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args){
        int i,score;
        double num=0,bili;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        System.out.println("输入班级总人数:"+i);
        for(int j=1;j<=i;j++){
            System.out.println("请输入第"+j+"位学生的成绩");
            score=sc.nextInt();
            if(score>80)
                num++;
            continue;
        }
        bili=num/i*100;
        System.out.println("80分以上的学生人数是:"+num);
        System.out.println("80分以上的学生所占比例位："+bili+"%");
    }
}
