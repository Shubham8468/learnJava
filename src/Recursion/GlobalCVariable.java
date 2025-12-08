package Recursion;

public class GlobalCVariable {
//    static int x=10;
    public static void main(String[] args) {
        int x=10;
        System.out.println(x);

        System.out.println(fun(x));
    }
    public static int fun(int x){
        x=20;
        return x;
    }
}
