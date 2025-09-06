package LinkedList;

import java.util.Stack;

//Find out the Node where the cycle begins.
//And print loop element in LinkedList
public class try2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
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
        int  size(){
            Node temp=head;
            int si=0;
            while(temp.next!=null){
                si++;
                temp=temp.next;
            }
            return si;
        }
        boolean palindrom(){
            Node temp=head;
            Node te=head;
            Node t=head;
            Stack<Integer> st=new Stack<>();
            while (temp!=null){
                if(temp!=null){
                    st.push(temp.data);
                }
                else{
                    break;
                }
                temp=temp.next;
            }
            int cou=size();
            int co=0;
            while (te!=null){
                if(te.data==st.pop()){
                    co++;
                    te=te.next;
                }
                else{
                    return false;
                }


            }
            return true;
        }

    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(1);
        System.out.println(ll.palindrom());

    }

//    public static void cycle(Node head) {
//        Node temp=head;
//        Node fast = head;
//        Node slow = head;
//
//        while (fast !=null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast==slow) break;
//        }
//        while (temp!=slow){
//            temp=temp.next;
//            slow=slow.next;
//        }
//        if(temp==slow){
//            System.out.print("yes! given LinkedList is cycle ");
//        }
//        else {
//            System.out.println("Not cycle LinkedList");
//
//        }
//
//        Node temp2=slow.next;
//        while (temp2!=slow){
//            System.out.println(temp2.data+" ");
//            temp2=temp2.next;
//        }
//        //System.out.println(slow.data);
//
//    }
//
//
//    public static void main(String[] args) {
//        Node a=new Node(1);
//        Node b=new Node(2);
//        Node c=new Node(3);
//        Node d=new Node(4);
//        Node e=new Node(5);
//        Node f=new Node(6);
//        Node g=new Node(7);
//        Node h=new Node(8);
//        Node i=new Node(9);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//        e.next=f;
//        f.next=g;
//        g.next=h;
//        h.next=i;
//        i.next=c;
//        cycle(a);
//
//
//    }
}



