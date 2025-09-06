package Sorting.BubbleSort;
//Now in this we use to optimize the code with the help of swepcount variable
//For the best case for example
//if arr is already shorted so there no need to perforn operation
//TIME Complexity is o(n2) in worst case also average case
public class implementBubbleSort {
    public static void print(int[] arr){
        for (int item : arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,-2,6,7,2,0,7,2};
        print(arr);
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int swaps=0;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps==0)break;
        }
        print(arr);
    }
}
