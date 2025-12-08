package LinkedList;
//Basicall we use this code for the shorting ll .
//use meger short
public class SortLL {
  public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
  }
 public static class LinekList{
      Node head=null;
      Node tail=null;
      void insertAtEnd(int data){
          Node temp=new Node(data);
          if(head==null){
              head=temp;

          }
          else{
              tail.next=temp;

          }
          tail=temp;
      }

     void Display(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;

         }
     }
      
      // Helper method to find middle of a given linked list starting from 'start'
      Node findMid(Node start){
         Node slow=start;
         Node fast=start;
         // IMPORTANT: We need fast.next.next to avoid infinite recursion
         while(fast.next!=null && fast.next.next!=null){
             fast=fast.next.next;
             slow=slow.next;
         }
         return slow;
      }

      //sort
      Node sort(Node temp){
          if(temp==null || temp.next==null){
              return temp;
          }
      Node mid=findMid(temp);
      Node right=mid.next;
      mid.next=null;
      Node left=temp;

     Node leftLl= sort(left);
     Node rightLL=sort(right);
      return merge(leftLl,rightLL);
      }
      Node merge(Node leftll,Node rightLL){
          Node temp=new Node(0);
          Node temp1=leftll;
          Node temp2=rightLL;
          Node te=temp;
          while (temp1!=null && temp2!=null){
              if(temp1.data<=temp2.data){
                  te.next=temp1;
                  te=temp1;
                  temp1=temp1.next;
              }
              else{
                  te.next=temp2;
                  te=temp2;
                  temp2=temp2.next;
              }
          }
          while (temp1!=null){
              te.next=temp1;
              te=temp1;
              temp1=temp1.next;
          }
          while(temp2!=null){
              te.next=temp2;
              te=temp2;
              temp2=temp2.next;
          }
          return temp.next;
      }

 }

    public static void main(String[] args) {
        LinekList ll=new LinekList();
        ll.insertAtEnd(23);
        ll.insertAtEnd(2);
        ll.insertAtEnd(25);
        ll.insertAtEnd(89);
        ll.insertAtEnd(90);
        System.out.print("Original: ");
        ll.Display();
        System.out.println();
        
        // Test with smaller list first to debug
        System.out.println("Testing with 2 elements...");
        LinekList ll2 = new LinekList();
        ll2.insertAtEnd(5);
        ll2.insertAtEnd(1);
        ll2.head = ll2.sort(ll2.head);
        System.out.print("Sorted 2 elements: ");
        ll2.Display();
        System.out.println();
        
        System.out.println("Now sorting main list...");
        ll.head = ll.sort(ll.head); // Update head with sorted list
        System.out.print("Sorted: ");
        ll.Display();

    }
}
