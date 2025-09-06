package DoublyLinkedList;

public class DeleteAtIdx {
    public static class Node{
        Node prvs;
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class DoublyL{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                temp.prvs=null;
                tail=temp;
                temp.next=null;
            }
            else{
                tail.next=temp;
                temp.prvs=tail;
                temp.next=null;
                tail=temp;
            }
        }
        void Displayrevrs(){
            Node temp=tail;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.prvs;
            }
        }
        void Display(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;

            }
        }
        void insrtAtBignning(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                temp.prvs=null;
                tail=head;
                temp.next=null;

            }
            else{
                temp.next=head;
                head.prvs=temp;
                head=temp;
                temp.prvs=null;

            }

        }
        void DeleteEnd(){
            Node temp=tail.prvs;
            temp.next=null;
            tail=temp;
        }
        void DeleteBignning(){
            Node temp=head.next;
            head=temp;
            temp.prvs=null;

        }
        void DeleteAtIdx(int idx){
            Node temp=head;
            for(int i=1;i<idx;i++){
               temp=temp.next;

            }
            temp.next=temp.next.next;
            temp.next.next.prvs=temp;
        }
        void sumTwo(int target){
            Node h=head;
            Node t=tail;
            while (h.data<t.data){
                if(h.data+t.data==target){
                    System.out.println(h.data+"and"+t.data+"is equle to target value");
                    break;
                }
                else if(h.data+t.data>target){
                    t=t.prvs;
                }
                else {
                    h=h.next;
                }
            }
        }
    }
    public static void main(String[] args) {
        DoublyL ll=new DoublyL();
       // ll.insrtAtBignning();




    }
}
