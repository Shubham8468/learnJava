package LinkedList.TRY23;

public class JAVA {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node tail=null;
        Node head=null;
        int size=0;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void Display(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
        void insertAtBeginning(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void insertAtIndex(int idx,int val){
            Node temp=new Node(val);
            int id=idx;
            Node tem=head;
            for(int i=1;i<=id-1;i++){
                tem=tem.next;
            }
            temp.next=tem.next.next;
            tem.next=temp;
        }
        void DeleteAtBeginning(int idx){
            Node temp=head;
            if(size<idx){
                System.out.println("plese Enter a valid idx !");
            }
            else {
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }

    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(23);
        ll.insertAtEnd(34);
        ll.insertAtEnd(67);

        ll.insertAtBeginning(5);
        ll.insertAtBeginning(90);
        ll.Display();
        System.out.println("  ");
        ll.insertAtIndex(3,21);
        ll.Display();

    }

}
