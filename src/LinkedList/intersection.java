package LinkedList;

public class intersection {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void intersection(Node head1,Node head2){
        Node tempA=head1;
        Node tempB=head2;
        int len1=0;
        while (head1!=null){
            len1++;
            head1=head1.next;
        }
        System.out.println(len1);
        int len2=0;
        while (head2!=null){
            len2++;
            head2=head2.next;
        }
        System.out.println(len2);
        if(len1>=len2){
            int step1=len1-len2;
            for(int i=1;i<=step1;i++){
                tempA=tempA.next;

            }
        }
        else {
            int step2=len2-len1;
            for(int i=1;i<=step2;i++){
                tempB=tempB.next;
            }
        }
        while (tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        System.out.println(tempA.data);
    }

    public static void main(String[] args) {
        Node a=new Node(23);
        Node b=new Node(23);
        Node c =new Node(45);
        Node d=new Node(56);
        Node e=new Node(23);
        Node f=new Node(23);
        Node g =new Node(45);
        Node h=new Node(56);
        a.next=b;//head1;
        b.next=c;
        c.next=d;
        d.next=e;//head2
        e.next=f;
        g.next=h;
        h.next=d;
        intersection(a,d);


    }
}
