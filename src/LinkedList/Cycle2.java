package LinkedList;
//Find out the node where the cycle begnis i.e,
//the node at which the tail node points.

public class Cycle2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int cyclebeginsNode(Node head){
        Node slow=head;
        Node fast=head;
        Node temp=head;
        while (fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        while (temp!=slow){
            temp=temp.next;
            slow=slow.next;

        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(2);
        Node c=new Node(0);
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;
        System.out.println(cyclebeginsNode(a));


    }
}
