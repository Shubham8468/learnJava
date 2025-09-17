package SelectionSorting;

public class MinimumitemInArray {
    public static void print(int[] arr){
        for(int temp:arr){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={54,67,89,93,10,49};
        print(arr);
        int min=arr[0];
        int minidex=-1;//let assume the first item is min
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
                minidex=i;
            }
        }
        System.out.println(min);
        System.out.println(minidex);
    }
}
