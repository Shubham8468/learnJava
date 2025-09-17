package Sorting.BubbleSort;

public class Try {
    public static void print(int[] arr){
        for(int temp : arr){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,-2,6,7,2,0,7,2};
        print(arr);
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);

    }
}
