package SelectionSorting;
//IN the selection short first we try to find the smallest item in the arr
//then we swap between them ..
//First we assum the first item OF the arr is small


public class Try {
   public static void print(int[] arr){
       for (int temp: arr){
           System.out.print(temp+" ");
       }
       System.out.println();
   }
    public static void main(String[] args) {
        int[] arr={5,-2,6,7,2,0,7,2};
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
