package Array;
import java.awt.desktop.ScreenSleepEvent;
import java.sql.SQLOutput;
import java.util.*;

public class GreaterThenX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the"+i+"element :");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int cout=0;
        for(int i=0;i<n;i++){
            if(arr[i]>num){
                cout++;
            }
        }
        System.out.println("Greater number is :  "  +cout);
    }
}
