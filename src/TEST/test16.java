package TEST;

public class test16 {
    public static void main(String[] args) {
        String a="abcdefghijklmnopqrs";
        for(int i=0;i<106;i++)
        {
            a=a+a;
        }
        char[] b;
        b=a.toCharArray();
        int c=b.length;
        for (int i=0;i<=c;i++)
        {
            for(int j=0;j<c/2;j++)
            {
                if (i%2==0)
                {
                    b[i]=b[i+1];
                }
                c=c/2;
            }

        }
        System.out.println(b[0]);

    }
}
