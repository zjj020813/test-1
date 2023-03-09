package TEST;

public class test18 {

    public static void halfArray(int[] array){
        for(int i=0;i<array.length;i++)
        {
            array[i]=array[i]/2;
        }
    }
    public static void printfArray(int[] array){
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+",");
        }
    }

    public static void main(String[] args) {
        int []a={2,4,6,8,10};
        halfArray(a);
        printfArray(a);
    }
}
