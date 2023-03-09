package ZUOYE;

public class Wallet {

        String name;
        double count;
        double qu;
        static  double yue;

    public  void  shengyu(){

        yue =yue+count-qu;
    }
public  void xianshi(){
    System.out.println(name+"剩余金额为"+yue);
}
    public static void main(String[] args) {
        Wallet A=new Wallet();
        A.name="A钱包";
        A.count=1000;
        A.shengyu();
        A.xianshi();
        Wallet B=new Wallet();
        B.name="B钱包";
        B.qu=200;
        B.shengyu();
        B.xianshi();
        A.xianshi();
    }
}
