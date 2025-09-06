package Queue;

public class LLImplementionOfCircularQueue {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Cq{
        Node tail=null;
        Node head=null;
        public void add(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
                tail.next=head;
            }
            else{
                tail.next=temp;
                tail=temp;
                tail.next=head;
            }
        }
        public int remove() throws Exception{
            if(head==null){
                throw new Exception("queue is Empty !");
            }
            else {
                int item=head.data;
                head=head.next;
                tail.next=head;
                return item;
            }
        }
        public  int peek() throws Exception{
            if(head==null){
                throw new Exception("queue is Empty !");
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
        public void Display(){
            if(head==null){
                System.out.println("Queue is Empty ");
            }
            Node slow=head;
            Node fast=head;
            while(slow!=null){
                System.out.print(slow.data+" ");
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    break;
                }
            }
        }

    }

    public static void main(String[] args)throws Exception {
        Cq q=new Cq();
        q.add(45);
        q.add(89);
        q.add(48);
        q.add(40);
        q.add(8);
        q.add(4);
        q.remove();
        q.remove();
        q.add(34);
        q.Display();
        System.out.println();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

    }
}
