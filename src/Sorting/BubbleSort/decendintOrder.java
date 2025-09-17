package Sorting.BubbleSort;

public class decendintOrder {
    public static void print(int[] arr){
       for (int temp: arr){
           System.out.print(temp+" ");
       }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        print(arr);
        int n=arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int swap=0;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }

        }
        print(arr);
    }
}
