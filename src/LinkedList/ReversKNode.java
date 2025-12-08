package LinkedList;

public class ReversKNode {
    public static void pritnArr(int[] arr){
        for(int temp: arr){
            System.out.println(temp+" ");
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int data){
            Node temp=new Node(data);
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
            System.out.println();
        }
        int[] spllit(int k){
            Node temp=head;
            int[] a=new int[k];
            for(int i=0;i<k;i++){
                a[i]=temp.data;
                temp=temp.next;
            }
            return a;
        }

    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(34);
        ll.insertAtEnd(4);
        ll.insertAtEnd(44);
        ll.insertAtEnd(64);
        ll.insertAtEnd(14);
        ll.insertAtEnd(24);
        ll.Display();
        pritnArr(ll.spllit(3));

    }
}
