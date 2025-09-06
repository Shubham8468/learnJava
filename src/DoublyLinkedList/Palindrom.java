package DoublyLinkedList;
//its meains 123321
//this number is Palindrom.
//here we identify the given DoublyLL this Palindrom or not;
public class Palindrom {
    public static class Node {
        Node prvs;
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    public static class DoublyLL {
        Node head = null;
        Node tail = null;

        void insert(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                temp.prvs = null;
                tail = temp;
                temp.next = null;
            } else {
                head.prvs = temp;
                temp.prvs=null;
                temp.next=head;
                head = temp;

            }
        }

        boolean palindrom() {
            Node t = head;
            Node d = tail;
            while (t != null) {
                if (t.data != d.data) {
                    return false;
                }
                t = t.next;
                d = d.prvs;
            }
            return true;
        }
        void Display(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }

    }

    public static void main(String[] args) {
        DoublyLL ll=new DoublyLL();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);
        ll.Display();
        System.out.println(ll.palindrom());



    }
}
