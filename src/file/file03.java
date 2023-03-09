//package file;
//
//import java.util.Scanner;
//
//public class file03 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        try {
//            System.out.println("请输入您的分数:");
//            int score = input.nextInt();
//            if (score < 0 || score > 100) {
//                throw new ScoreException("分数必须在0—100之间");
//            }
//            System.out.println("分数为：" + score);
//
//        } catch (ScoreException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//
//    }
//}
//
//
//
//
//package com.bjxst.test01;
//
//public class ScoreException extends Exception {
//
//    public ScoreException() {
//        super();
//    }
//
//    public ScoreException(String message) {
//        super(message);
//    }
//
//}
