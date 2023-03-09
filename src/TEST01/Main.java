package TEST01;

public class Main {
    public static void main(String[] args) {
        Rectangle1 t=new Rectangle1();
        t.setLength(5);
        t.setWidth(4);
        t.getPerimeter();
        t.getArea();
        String s=t.toString();
        System.out.println(s);
    }
}
