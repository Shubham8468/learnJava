package Queue;
//In this we know that implement the qeueu with the help of Array
//know we use pointer which are point to the arr
//With the helpe of pointer we add items in the arr and also remove items to the arr
//in this push item on the
//    remove -> |               |<- push
//          front|             | rear
//
public class ArrayImplementation {
    public static class queue{
        int[] arr=new int[100];
        int f=-1;
        int r=-1;
        public void add(int val){//
            if(r==arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if(f==-1){//queue is empty!
                f=0;
                r=0;
                arr[0]=val;
            }
            else{
                arr[r+1]=val;
                r+=1;
            }
        }
        public int remove(){
            if(r==-1|| f>r){
                System.out.println("Queue is empty !");
                return -1;
            }
            else{
                int item=arr[f];
            f+=1;
            return item;
            }
        }
        public int peek(){
            if(f==-1 || f>r){
                System.out.println("Queue is empty !");
                return -1;
            }
            else{
                return arr[f];
            }
        }
        public void Display(){
            if(f==-1|| f>r){
                System.out.println("Queue is empty !");
                return;
            }
            else{
                for (int i = f; i <=r; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
        public boolean isEmpty(){
            if(f==-1|| f>r){
                return true;
            }
            else{
                return false;
            }
        }
        public int size(){
            if(f==-1 || f>r){
                System.out.println("Queue is empty!");
                return -1;
            }
            else{
                return r-f+1;
            }

        }
        public void clear(){
            f=-1;
            r=-1;
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(78);
        q.add(90);
        q.add(7);
        q.add(10);
        q.add(8);
        q.add(95);
        q.add(74);
        q.add(93);
        q.Display();
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}





