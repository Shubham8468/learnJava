package Recursion;
import  java.util.*;
public class num {
    static int n;
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Number :");
//        n=sc.nextInt();
//        int x=1;
//        print(x);
        prin(23);
    }
    public static void print(int x){
        if(x>n)return;
        System.out.print(x+" ");
        print(x+1);//call same function

    }
    public  static void prin(int n){
        if(n==0)return;
        prin(n-1);
        System.out.println(n+"");

    }
}
