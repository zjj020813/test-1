package TEST;

public class test17 {

    public static double QH(double a,double b){
        for(double i=1;i<=b;i++)
        {
            a+=(i)/(i+1);
            System.out.print(i+"  ");
            System.out.printf("%.4f\n",a);
        }

        return a;
    }



    public static void main(String[] args) {
        QH(0,20);

    }
}
