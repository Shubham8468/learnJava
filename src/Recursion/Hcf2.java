package Recursion;
//Please visite the recursion 1 video on youtub
public class Hcf2 {
    public static int hcf(int a ,int b){
        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }
    public static void main(String[] args) {
        System.out.println(hcf(12,16));
    }
}
