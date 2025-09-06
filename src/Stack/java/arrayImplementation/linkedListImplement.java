package Stack.java.arrayImplementation;

public class linkedListImplement {
    public static class Node{//this is user define data type that i useed
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    public static class Stack{//user defined data structure
        Node head=null;
       void push(int x){//Insertion at head;
           Node temp=new Node(x);
           temp.next=head;
           head=temp;
       }
       void displayres(Node h){
           if(h==null){
               return ;
           }
           displayres(h.next);
           System.out.print(h.val+" ");
       }
       void display(){//in this print reverse ll
           displayres(head);
           System.out.println();

       }
       void displayRev(){
           Node temp=head;
           while(temp!=null){
               System.out.print(temp.val+" ");
               temp=temp.next;
           }
           System.out.println();
       }
       int peek(){
           if(head==null){
           System.out.println("Stack is Empty!");
               return -1;
           }
           Node top=head;
           return top.val;
       }
       int pop(){
           if(head==null){
               System.out.println("Stack is Empty!");
               return -1;
           }
           int top=head.val;
           head=head.next;
           return top;
       }
       boolean isEmpty(){
           if(head==null){
               return true;
           }
           else{
               return false;
           }
       }
       int size(){
           Node temp=head;
           int count=0;
           while(temp!=null){
               count++;
               temp=temp.next;
           }
           return count;
       }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(3);
        st.push(4);
        st.push(0);
        st.display();
        System.out.println(st.peek());
        System.out.println( st.pop());
        st.display();
        System.out.println();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
