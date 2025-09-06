package LinkedList;
// Arenge First All Odd Numbers Then All Even Numbers

public class SplitFirstOddThenEvenNum {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedL{
        Node head=null;
        Node tail=null;
        void add(int val){
            Node temp=new Node(val);
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
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;

            }
        }
        void SplitFirstoddthenEven(){
            Node temp=head;
            Node o=new Node(100);
            Node odd=o;
            Node e=new Node(100);
            Node even=e;
            while (temp!=null){
                if(temp.data%2!=0){
                    Node a=new Node(temp.data);
                    odd.next=a;
                    odd=a;
                    temp=temp.next;
                }
                else {
                    Node a=new Node(temp.data);
                    even.next=a;
                    even=a;
                    temp=temp.next;
                }
            }
            Node od=o.next;
            while (od.next!=null){
                od=od.next;
            }

            od.next=e.next;
            Node D=o.next;
            while (D!=null){
                System.out.println(D.data+" ");
                D=D.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedL ll = new LinkedL();
        ll.add(3);
        ll.add(5);
        ll.add(4);
        ll.add(1);
        ll.add(2);
        ll.add(8);
        ll.add(10);
        ll.add(23);
        ll.SplitFirstoddthenEven();


    }
}
