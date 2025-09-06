package DoublyLinkedList;
//Sortest List in Non-decreasing order
//In this question given a Target
public class TwoSum {
    public static class Node{
        Node prvs;
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    public static class Doublyll{
        Node head=null;
        Node tail=null;
        void add(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                temp.prvs=null;
                tail=temp;
                temp.next=null;

            }
            else{
                head.prvs=temp;
                temp.prvs=null;
                temp.next=head;
                head=temp;

            }
        }
        void Display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
        void revsDisplay(){
            Node temp=tail;
            while (temp.prvs==null){
                System.out.println(temp.data+" ");
                temp=temp.prvs;
            }
        }
        void TwoSum(int target){
            Node h=head;
            Node t=tail;
            while (h.data<t.data){
                if(h.data+t.data==target){
                    System.out.println(h.data+"and"+t.data+"is equle to the Target value");
                    break;
                }
               else if(h.data+t.data>target){
                    t=t.prvs;
                } else if (h.data+t.data<target) {
                   h=h.next;

                }
               else  {
                    System.out.println("Given targated valu is found in LinkedList");
                }

            }
        }
    }

    public static void main(String[] args) {
        Doublyll ll=new Doublyll();
        ll.add(100);
        ll.add(13);
        ll.add(8);
        ll.add(5);
        ll.add(3);
        ll.Display();
        System.out.println();
        ll.revsDisplay();
         ll.TwoSum(12);


    }
}
