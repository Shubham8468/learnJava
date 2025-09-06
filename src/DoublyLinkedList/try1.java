package DoublyLinkedList;

public class try1 {
    public static class Node{
        int data;
        Node next;
        Node prvs;
        Node(int data){
            this.data=data;
        }
    }
    public static void Display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void revers(Node tail){
        Node temp=tail;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.prvs;
        }
    }
    public static void Displayrandom(Node randem){
        Node temp=randem;
        while (temp.prvs!=null){
            temp=temp.prvs;
        }
        while (temp!=null){
            System.out.println(temp.data+"");
            temp=temp.next;
        }

    }
    public static Node insertAthead(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head.prvs=temp;
        head=temp;
        return head;
    }
    public static Node insertAttail(Node tail,int data){
        Node temp=new Node(data);
        tail.next=temp;
        temp.prvs=tail;
        tail=temp;
        return tail;
    }
    public static void insertAtIndx(Node head,int idx,int val){
        Node t=new Node(val);
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        temp.next.prvs=t;
        t.prvs=temp;
        t.next=temp.next;
        temp.next=t;

    }

    public static void main(String[] args) {
        Node a=new Node(34);
        Node b=new Node(56);
        Node c=new Node(4);
        Node d=new Node(89);
        Node e=new Node(8);
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
        Node t=insertAthead(a,890);
        Display(t);

        insertAtIndx(a,2,678);
        System.out.println();
        Display(t);


    }
}
