package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code her
        int random = (int) (Math.random()*10);

        System.out.println("我行我素购物管理系统 > 幸运抽奖\n");
        System.out.println("请输入4位会员号、");
        Scanner input = new Scanner(System.in);
        int custNo = input.nextInt();
        System.out.println("随机数为"+random);

        int baiwei = custNo / 100 % 10;

        if (baiwei == random) {
            System.out.println(custNo + "是幸运用户，获得精美MP3一个");
        }
        else {
            System.out.println(custNo + "谢谢您的支持！");

        }
    }
}
