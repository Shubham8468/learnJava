package Sorting.BubbleSort;

public class BasicSorting {
    public static void print(int[] arr){
        for (int prl :arr){
            System.out.print(prl+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,-2,6,7,2,0,7,2};
        int n=arr.length;
        print(arr);
        for (int j = 0; j < n-1; j++) {//n-1 bar loop chal rha hai


            for (int i = 0; i < n - 1-j; i++) {
                //hmne yha pe isliye n-1-j kiya hai kyuki hr pas ke bad last vala item sorted ho ja rha hai
                // ider bhi n-1 bar loop chal rha hai
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
