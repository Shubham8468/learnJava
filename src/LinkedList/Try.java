package LinkedList;
public class Try {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node tail=null;
        Node head=null;
        void insertAtEnd(int data){
           Node temp=new Node(data);
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
            while(temp!=null){
                System.out.println(temp+" ");
                temp=temp.next;
            }
        }
//        sort(Node head){
//
//        }

    }
    public static void main(String[] args) {

    }



}
