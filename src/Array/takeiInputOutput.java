package Array;
import java.util.*;

public class takeiInputOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of index");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            System.out.println("Enter the "+i+" number :");
            arr[i]=sc.nextInt();

        }
        for(int j=0;j<=n-1;j++){
            System.out.println(arr[j]);
        }
    }
}
