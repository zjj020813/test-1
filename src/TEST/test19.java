package TEST;

public class test19 {

    public static double Pow(double x,int n) {
        double cj=1;
        for (int i=0;i<n;i++)
        {
            cj=cj*x;
        }

        return cj;

    }

    public static void main(String[] args) {
       double a= Pow(2,3);
        System.out.println(a);

    }
}
