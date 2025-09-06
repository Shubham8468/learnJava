package LinkedList;

public class MiddRigthElement {
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
        void add(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;

            }
        }
        void Display(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data+"");
                temp=temp.next;
            }
        }
        int  len(){
            Node temp=head;
            int count =0;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void middElement(){
            // Here we create two Node first is slow and secound is fast .
            // we move slow 1x steps and move fast pointer move 2x steps.
            Node slow=head;
            Node fast=head;
            int se=len();
            if(se%2==0){
                while (fast.next.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                System.out.println("Middle Element is "+slow.data);
            }
            else {
                while (fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;

                }
                System.out.println("Middle Element is "+slow.data);
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(67);
        ll.add(23);
        ll.add(56);
        ll.add(87);
        ll.add(98);
        ll.add(23);
        ll.Display();
        ll.middElement();

    }

}
