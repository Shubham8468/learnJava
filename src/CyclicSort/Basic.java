package CyclicSort;

public class Basic {
    public static void print(int[] arr){
        for(int temp : arr){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    public static void cyclic(int[] arr){
        int n=arr.length;
        int idx=0;
        while(idx!=n){
            if(arr[idx]==idx){
                idx++;
            }
            else{
                swap(idx,arr);
            }
        }
    }
    public static void swap(int idx,int[] arr){
        int temp=arr[idx];
        arr[idx]=arr[temp];
        arr[temp]=temp;
    }
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1,0};
        print(arr);
        cyclic(arr);
        print(arr);
    }
}
