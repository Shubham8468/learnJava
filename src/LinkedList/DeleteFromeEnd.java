package LinkedList;
// here we have use formules frome sequence of series this
// mth Node frome start of linkedlist = m-n+1;
// m=totel numbers of Node in linkedlist;
// and n=number of index frome the last of linkedlist;
public class DeleteFromeEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Node head=null;
        Node tail=null;
        void add(int val){
            Node temp=new Node (val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void Dispaly(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
        int  size(){
            Node temp=head;
            int size=0;
            while (temp!=null){
                size++;
                temp=temp.next;
            }
            return size;
        }
        Node  nthNodeFromeEnd(int idx){
           Node temp=head;
            int m=size()-idx+1;
            for(int i=1;i<=m-1;i++){
                temp=temp.next;
            }

            return temp;
        }
    }

    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.add(23);
        ll.add(56);
        ll.add(78);
        ll.add(90);
        ll.add(67);
        ll.Dispaly();
        Node b=ll.nthNodeFromeEnd(3);
        System.out.println(b.data);
    }
}
