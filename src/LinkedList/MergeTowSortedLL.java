package LinkedList;

public class MergeTowSortedLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head;
        Node tail;
        void add(int valu){
            Node temp=new Node(valu);
            if(head==null){
                head=temp;

            }
            else {
                tail.next=temp;
            }
            tail=temp;
        }
        void Display(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static Node MergeTwoSorted(Node hea1,Node hea2){
        Node temp1=hea1;
        Node temp2=hea2;
        Node head=new Node(100);
        Node temp=head;
        while (temp1!=null&&temp2!=null){

            if(temp1.data<temp2.data){
                Node a=new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;
            }
            else {
                Node a=new Node(temp2.data);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        Node Di=head.next;
        while (Di!=null){
            System.out.println(Di.data+" ");
            Di=Di.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(1);
        ll.add(3);
        ll.add(5);
        ll.add(8);
        ll.add(9);
        Linkedlist l=new Linkedlist();
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(7);
        ll.Display();
        System.out.println(" ");
        l.Display();
        System.out.println(" ");
        MergeTwoSorted(ll.head,l.head);


    }
}
