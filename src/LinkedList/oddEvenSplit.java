package LinkedList;

public class oddEvenSplit {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static class LinedList{
        Node head=null;
        Node tail=null;
        void addAthead(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void Display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
       void split() {
           Node temp = head;
           Node odd = new Node(100);
           Node o=odd;
           Node de=odd.next;
           Node even = new Node(100);
           Node ev=even;
           while(temp!=null){
               if(temp.data%2==0){
                   odd.next=temp;
                   odd=temp;
                   temp=temp.next;

               }
               else{
                   even.next=temp;
                   even=temp;
                   temp=temp.next;
               }
           }
           while(o.next!=null){
               o=o.next;
           }
           o.next=ev.next;
           while(de!=null){
               System.out.println(de.data+" ");
               de=de.next;
           }
       }

    }

    public static void main(String[] args) {
        LinedList ll=new LinedList();
        ll.addAthead(23);
        ll.addAthead(66);
        ll.addAthead(9);
        ll.addAthead(12);
        ll.addAthead(5);
       ll.split();
        //ll.Display();
    }
}
