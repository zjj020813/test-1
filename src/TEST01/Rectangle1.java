package TEST01;

public class Rectangle1 {
    double length=1;
    double width=1;

    public void rectangle(){}

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getWidth(){
        return length;
    }

    public void setWidth(double length){
        this.length=length;
    }

    public double getArea(){
        double mj=length*width;
        return mj;
    }
    public double getPerimeter(){
        double zc=(length+width)*2;
        return zc;
    }
    public String toString() {

        return  length +" "+ width +" "+getArea()+" "+getPerimeter();
    }


}