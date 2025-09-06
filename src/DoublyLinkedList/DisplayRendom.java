package DoublyLinkedList;

import LinkedList.Try;

public class DisplayRendom {
    public static class Node{
        int data;
        Try.Node next;
        Node(int data){
            this.data=data;

        }
    }
    public static void Displayrandom(try1.Node randem){
        try1.Node temp=randem;
        while (temp.prvs!=null){
            temp=temp.prvs;
        }
        while (temp!=null){
            System.out.println(temp.data+"");
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        try1.Node a=new try1.Node(34);
        try1.Node b=new try1.Node(56);
        try1.Node c=new try1.Node(4);
        try1.Node d=new try1.Node(89);
        try1.Node e=new try1.Node(8);
        a.prvs=null;
        a.next=b;
        b.prvs=a;
        b.next=c;
        c.prvs=b;
        c.next=d;
        d.prvs=c;
        d.next=e;
        e.prvs=d;
        e.next=null;
      //  Display(a);
      //  System.out.println();
       // revers(e);
       // System.out.println();
        Displayrandom(c);
    }
}
