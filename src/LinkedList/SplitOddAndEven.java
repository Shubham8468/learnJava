package LinkedList;
//Split it into two list such that one contains odd values,while the other contains even values.
//Divied

public class SplitOddAndEven {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;

        void add(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

        void Split() {
            Node temp=head;
            Node e=new Node(100);
            Node even=e;
            Node o=new Node (100);
            Node odd=o;
             while (temp!=null){
                 if(temp.data%2==0){
                     Node a=new Node(temp.data);
                     even.next=a;
                     even=a;
                     temp=temp.next;

                 }
                 else {
                     Node a=new Node(temp.data);
                     odd.next=a;
                     odd=a;
                     temp=temp.next;
                 }

             }
             Node D=e.next;
             while (D!=null){
                 System.out.println(D.data+" ");
                 D=D.next;
             }
             Node D1=o.next;
            System.out.println(" ");
             while (D1!=null){
                 System.out.println(D1.data+" ");
                 D1=D1.next;
             }


        }

    }


    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.add(3);
        ll.add(5);
        ll.add(4);
        ll.add(1);
        ll.add(2);
        ll.add(8);
        ll.add(10);
        ll.add(22);
        ll.Split();


    }
}