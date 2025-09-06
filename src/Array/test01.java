package Array;

public class test01{
    public static void revarc(int[] arr,int l){
        int n=arr.length;
        int i=n-1;
        int j=0;
        while (i>j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i--;
            j++;
        }
        j=n-l;
        i=n-1;
        while (i>j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i--;
            j++;

        }
        j=l;
        i=n-l;
        while (i>j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i--;
            j++;
        }
        for(int s=0;s<n;s++) {
            System.out.print(arr[s]);
        }

    }
    public static void main(String[] args) {

        int[] arr={2,3,4,5,6,7,8,9};
        revarc(arr,2);
        System.out.println();
        for(int s=0;s<arr.length;s++) {
            System.out.print(arr[s]);
        }

    }
}
