package LinkedList;
//First we find the lenght of the first linkedlist
//than we find length of the secound linkedlist
//And `

public class IntersectionOfTwoLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
    }

      public static   void Displau(Node head){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }

      }
      public static void  intersectionOfLinkedList(Node hd1, Node hd2 ) {
          Node le1 = hd1;
          Node le2 = hd2;
          int size1=0;
          int size2=0;
          while (le1!=null){
              size1++;
              le1=le1.next;
          }
          while (le2!=null){
              size2++;
              le2=le2.next;
          }
          for(int i=1;i<=(size1-size2);i++){
              hd1=hd1.next;
          }
          while (hd1!=hd2){
              hd1=hd1.next;
              hd2=hd2.next;
          }
          System.out.println(hd1.data);
      }





    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(90);
        Node f=new Node(809);
        Node g=new Node(78);
        Node h=new Node(67);
        Node i=new Node(34);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        g.next=h;
        h.next=i;
        i.next=d;
        intersectionOfLinkedList(a,g);

    }
}
