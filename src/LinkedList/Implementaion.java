package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Implementaion {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void DeleteAtEnd() {
            Node temp = head;
            if (temp == null || temp.next == null) {
                return;
            }
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }

        void DeleteAtBignning() {
            Node temp = head;
            if (temp == null) {
                return;
            }
            head = temp.next;
            temp.next = null;
            size--;
        }

        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
        void DeleteAtIndex(int ide){
            Node temp=head;
             if (ide<0||ide>size) {
                System.out.println("Enter a valid index");
                return;
            }
             if(ide==1){
                 DeleteAtBignning();
                 return;
             }
             if(ide==size){
                 DeleteAtEnd();
                 return;
             }
            for(int i=1;i<=ide-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        void InsertAtBegnning(int val){
            Node temp=new Node(val);

             if(head==null){
                 head=temp;
                 tail=temp;

             }
             else {
                 temp.next=head;
                 head=temp;
             }
        }
        void InsertAtIndex(int ind,int valu){
            if(ind==1){
                InsertAtBegnning(valu);
                return;
            }
            if(ind==size){
                insertAtEnd(valu);
                return;
            }
            Node temp=new Node(valu);
            Node te=head;
            for(int i=1;i<=ind-1;i++){
                te=te.next;
            }
            temp.next=te.next;
            te.next=temp;
        }
        void  printev(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
               if(temp.next!=null) {

                   temp = temp.next.next;
               }
               else{
                   break;
               }
            }
            Node te=head.next;
            System.out.println();
            while(te!=null){
                System.out.println(te.data+" ");
                if(te.next!=null){
                    te=te.next.next;
                }
                else{
                    break;
                }
            }
        }
        void test(){
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
        Node swap(int k){

         for(int i=1;i<=k;i++) {
             Node temp=head;
             while (temp.next.next != null) {
                 temp = temp.next;
             }

                 Node te=temp.next;
                 temp.next.next = head;
                 temp.next = null;
                 head=te;
             

         }
         return head;
        }
        int sizes(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void  removeDuplicats(){
            Node temp=head;
            Queue<Integer> q=new LinkedList<>();
            while(temp!=null){
                q.add(temp.data);
                temp=temp.next;
            }
            System.out.println(q);

        }
        void chek(int n){
            Node temp=head;
            for(int i=1;i<n;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }





    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();

        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        //ll.insertAtEnd(4);
        //ll.insertAtEnd(5);
      //  ll.insertAtEnd(45);
       //ll.test();
        //ll.Display();
       // ll.printev();
       //ll.swap(20000000);
      // ll.Display();
      //ll.removeDuplicats();
      // ll.chek(2);
        ll.Display();


    }
}
