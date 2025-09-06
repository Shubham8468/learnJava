package LinkedList;

public class RemovingNthNodeFromTheEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
         Node head=null;
         Node tail=null;
         void intserAtEnd(int val){
             Node temp=new Node(val);
             if(head==null){
                 head=temp;
             }
             else{
                 tail.next=temp;
             }
             tail=temp;
         }
         void Dispaly(){
             Node temp=head;
             while (temp!=null){
                 System.out.println(temp.data+" ");
                 temp=temp.next;
             }

         }
         void RemovNthNodeFromEnd(int idx){
             Node fast=head;
             Node slow=head;
             for(int i=1;i<=idx;i++){
                 fast=fast.next;
             }
             while (fast.next!=null){
                 slow=slow.next;
                 fast=fast.next;

             }
             slow.next=slow.next.next;


         }
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.intserAtEnd(34);
        ll.intserAtEnd(56);
        ll.intserAtEnd(3);
        ll.intserAtEnd(5);
        ll.intserAtEnd(4);
        ll.intserAtEnd(6);
        ll.Dispaly();
        System.out.println(   " ");
        ll.RemovNthNodeFromEnd(3);
        ll.Dispaly();
    }

}
