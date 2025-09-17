package SelectionSorting;

public class basic {
    public static void print(int[] arr){
        for(int temp : arr){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,-2,6,7,2,8,7,2};
        int n=arr.length;
        print(arr);
        for (int i = 0; i < n-1; i++) {
            int mindex=i;
            for (int j = i+1; j <n ; j++) {//this loop for the find the small element in arr
                if(arr[j]<arr[mindex]){
                    mindex=j;
                }
            }
            int temp=arr[mindex];
            arr[mindex]=arr[i];
            arr[i]=temp;

        }
        print(arr);
    }
}
