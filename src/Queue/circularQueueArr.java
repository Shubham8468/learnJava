package Queue;

public class circularQueueArr {
    public static class cqa{
       int[] arr=new int[6];
       int n=arr.length;
       int f=-1;
       int r=-1;
       int size=0;
       public  void add(int val)throws Exception {
           if(size==n){
               throw new Exception("Queue is Full!");
           }
           else if(size==0){
               f=r=0;
               arr[0]=val;
           }
           else if(f<=r){
               arr[++r]=val;
           }
           else if(r==n-1){
               r=0;
               arr[0]=val;
           }
           size++;

       }
       public void Display() throws Exception{
           if(size==0){
               throw new Exception("Queue is Empty!");
           }
           if(f<r){
               for(int i=f;i<=r;i++){
                   System.out.print(arr[i]+" ");
               }
           }
           if(f>r) {
               for (int i = f; i < n; i++) {
                   System.out.print(arr[i] + " ");
               }
               for (int i = 0; i <= r; i++) {
                   System.out.print(arr[i] + " ");
               }
           }
       }
       public int remove() throws Exception{
           if(size==0){
               throw new Exception("qeueu is empty!");
           }
           else if(f==n-1){
               int item=arr[f];
               f=0;
               size--;
               return item;
           }
           else {
               int item=arr[f];
               f++;
               size--;
               return item;
           }

       }
       public int peek() throws Exception{
           if(size==0) {
               throw new Exception("Queue is empty !");
           }
           else{
               return arr[f];
           }
       }

    }
    public static void main(String[] args)throws Exception {
        cqa q=new cqa();
        q.add(56);
        q.add(6);
        q.add(5);
        q.add(66);

       q.add(90);
       q.add(89);
       q.remove();
        q.Display();

        q.add(90);


//        System.out.println(q.arr[0]);
//        System.out.println(q.arr[1]);
//        System.out.println(q.arr[2]);
//        System.out.println(q.arr[3]);
//
   }
}
