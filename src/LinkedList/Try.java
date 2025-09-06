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
       void inserAtEnd(int data){
           Node temp=new Node(data);
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
       Node nthnodeEnd(int idx){
           Node slow=head;
           Node fast=head;
           int count=0;
           for(int i=1;i<=idx;i++){
               count++;
               fast=fast.next;
           }
           Node temp=head;
           if(idx>count){
               System.out.println("idx is out of bound");
               return null;
           }
           while (fast!=null){
               fast=fast.next;
               slow=slow.next;

           }

           return slow;
       }
       Node DeleteNthNodeLast(int idx){
           Node slow=head;
           Node fast=head;
           for (int i=1;i<=idx;i++){
               fast=fast.next;
           }

           while (fast.next!=null){
               slow=slow.next;
               fast=fast.next;
           }
           slow.next=slow.next.next;
           return head;

       }
   }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.inserAtEnd(45);
        ll.inserAtEnd(5);
        ll.inserAtEnd(4);
        ll.inserAtEnd(35);
        ll.inserAtEnd(75);
       // Node tem=ll.nthnodeEnd(6);
       // System.out.println(tem.data);
        ll.DeleteNthNodeLast(2);
        ll.Display();


    }



}