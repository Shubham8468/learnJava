package LinkedList;

public class DeleteMiddElem {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }

    }
    public static class linkedList{
        Node head=null;
        Node tail=null;
        void add(int valu){
            Node temp=new Node(valu);
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
            while(temp!=null){
                System.out.println(temp.data+"");
                temp=temp.next;
            }
        }
        int  length(){
            Node temp=head;
            int coun=0;
            while (temp!=null){
                coun++;
                temp=temp.next;
            }
            return coun;
        }
        Node DeleteMiddElement(){
            if(head.next==null){
                return null;
            }
            Node slow=head;
            Node fast=head;
            int size=length();
            if(size%2==0) {
                while (fast.next.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;

                }
                slow.next = slow.next.next;
            }
            else{
                while (fast.next.next.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                slow.next=slow.next.next;
            }
            return head;
        }
        void Dispalay(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.add(23);

        ll.Dispalay();
        System.out.println("  ");
        ll.DeleteMiddElement();
        ll.Dispalay();

    }

}
