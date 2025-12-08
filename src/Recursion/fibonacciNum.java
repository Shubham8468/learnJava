package Recursion;

public class fibonacciNum {
    public static void fibo(int n,int i){
        if(n==0 || n==1){
            System.out.println(n+" ");
            return;
        }
        int fi=((i-1)+(i-2));
        int f=((i-1)+(i-2));
        System.out.println((fi+f)+" ");
        fibo(n-1,i+1);
    }
    public static void main(String[] args) {
        fibo(10,3);
    }
}
