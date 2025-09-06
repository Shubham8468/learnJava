package LinkedList;

public class SortTwoLinkedListSelfNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head=null;
        Node tail=null;
        void Add(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
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
    public static void SortTwoLinkedList(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        Node t=new Node(100);
        Node temp=t;
        while (temp1!=null&&temp2!=null){
            if(temp1.data<temp2.data){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;

        }
        else{
            temp.next=temp1;
        }
        Node D=t.next;
        while (D!=null){
            System.out.println(D.data+" ");
            D=D.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.Add(1);
        ll.Add(3);
        ll.Add(5);
        ll.Add(8);
        ll.Add(9);
        Linkedlist l=new Linkedlist();


        l.Add(2);
        l.Add(4);
        l.Add(6);
        l.Add(7);
        SortTwoLinkedList(ll.head,l.head);
    }
}
