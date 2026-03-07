package Heap;

public class try01 {
    public static class Node {
        int data ;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class LinkedList{
        Node head=null;
        Node tail= null;
        void insertAtEnd(int data){
            Node temp= new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }

        }
        void insertAtTop(int data){
            Node temp= new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                 temp.next=head;
                 head=temp;
            }
        }
        void DeleteTop(){
            if(head== null){
                System.out.println("LL Not Exist!!!");
                return;
            }
            else{
                head=head.next;
            }
        }
        void Display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+"");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(23);
        ll.insertAtEnd(34);
        ll.insertAtEnd(89);
        ll.insertAtEnd(94);
        ll.insertAtTop(120);
        ll.DeleteTop();
        ll.Display();
    }
}
