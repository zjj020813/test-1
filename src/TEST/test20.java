package TEST;

public class test20 {

    public static int maxElement(int []a){
        int max=0;
        for (int i=0;i<a.length;i++)
        {
            if (max<a[i])
            {
                max=a[i];
            }
        }


        return max;
    }


    public static void main(String[] args) {
        int[] b={1,2,3,4,5};
      int c=maxElement(b);
        System.out.println(c);



    }
}
