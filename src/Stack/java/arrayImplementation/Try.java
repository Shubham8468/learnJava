package Stack.java.arrayImplementation;

public class Try {
    public static class Stack{
        int[] arr=new int[45];
        int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full!");
            }
            arr[idx]=x;
            idx++;
        }
        void peek(){
            if(idx==0){
                System.out.println("Stack is Empty!");
            }
            System.out.println(arr[idx-1]);
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void Display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isFull(){
            return idx == arr.length;
        }
        boolean isEmpty(){
            return idx == 0;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
       // st.Display();
        //st.pop();
       // st.Display();
        //System.out.println( st.isEmpty());
        //System.out.println(st.isFull());
        //st.peek();


    }
}
