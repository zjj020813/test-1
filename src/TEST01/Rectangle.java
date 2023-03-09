
package TEST01;

public  class Rectangle {
   static double width=1;
   static double height=1;


    public static void  getPermeter(){
        System.out.print(width+"  "+height+" "+(width+height)*2);
    }
    public static void  getArea (){

        System.out.println(" "+width*height);
    }

    public static void main(String[] args) {
        Rectangle t1=new Rectangle();
        Rectangle t2=new Rectangle();
        t1.width=4;
        t1.height=40;

        t1.getPermeter();
        t1.getArea();

        t2.width=3.5;
        t2.height=35.9;

        t2.getPermeter();
        t2.getArea();



    }

}