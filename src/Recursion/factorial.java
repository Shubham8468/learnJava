package Recursion;

public class factorial {
    public static int facto(int n){
        return (n<=1)?1:n*facto(n-1);
    }
    public static void main(String[] args) {
        System.out.println( facto(5));
    }
}
