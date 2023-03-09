package TEST01;

public class Moive {
    private String title;
    String director;
    String genre;
    double rating;
    public Moive(){

    }
    public Moive(String title,String director,String genre,double rating){
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
    }
    public void playIt(){
        System.out.println("电影名称为："+title+"\n导演是："+director+"\n类型为："+genre+"\n评分是："+rating);
    }

    public static void main(String[] args) {
        Moive m1 =new Moive();
        m1.playIt();
        Moive m2 = new  Moive("长津湖","Zou","抗日",9.2);
        m2.playIt();
    }
}
