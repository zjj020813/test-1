package TEST;

public class test3 {
    public static void main(String[] args){
        Node head,middle,last;
        head=new Node();
        middle=new Node();
        last=new Node();
        head.date=10;
        middle.date=30;
        last.date=30;
        head.next=middle;
        middle.next=last;
        last.next=null;
        Node currentNode=head;
        while (currentNode!=null){
            System.out.println(currentNode.date);
            currentNode=currentNode.next;
        }

    }
}

class Node{
  public  int date;
    public  Node next;
}