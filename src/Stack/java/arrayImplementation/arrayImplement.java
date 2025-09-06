package Stack.java.arrayImplementation;

public class arrayImplement {
    public static class Stack{
         private  int[] arr=new int[7];
        private int idx=0;//vvvimp//its use for the point the array
        void push(int item){
            if(isFull()==true){
                System.out.println("Stack is full!");
                return ;
            }
            arr[idx]=item;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;//bydefult arr conten zero number;
            idx--;
            return top;
        }
        void Display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            int si=idx;
            return si;
        }
        boolean isFull(){
            if(idx==arr.length)return true;
            else{
                return false;
            }
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        //System.out.println(st.isEmpty());
        st.push(3);
        st.push(4);
        st.push(0);
       // st.push(67);
        st.Display();

    }
}
