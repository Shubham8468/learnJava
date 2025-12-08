package Recursion;
//This  is a methods use for the gives time complexity of the  powerAnswer in (log n );
public class power2 {
    public static int pow(int a,int b){
        if(b==0)return 1;
        int call=pow(a,b/2);
        if(b%2==0) {
            return call * call;
        }
        else{
            return a*call*call;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
}
