package Queue;
//head -> deletetion
//        peek
//tail -> push
public class LinkedListImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class queue{
        Node head=null;
        Node tail=null;
        public void add(int val){
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
        public int remove(){
            if(head==null){
                System.out.print("Qeueu is Empty!");
                return -1;
            }
            int item=head.data;
            head=head.next;
            if(head==null){//Queue become empty!
                tail=null;
            }
            return item;
        }
        public void clear(){
            head=null;
            tail=null;
        }
        public void Display(){
            Node temp=head;
            if(temp==null){
                System.out.println("Qeueu is Empty !");
                return ;
            }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public int peek(){
            if(head==null){
                System.out.println("Queue is Empty !");
                return -1;
            }
            else{
                return head.data;
            }
        }
        public boolean isEmpty(){
            if(head==null){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
      queue q=new queue();
      q.add(56);
      q.add(90);
      q.add(78);
      q.add(45);
      q.Display();
      q.clear();
      q.Display();

    }
}
