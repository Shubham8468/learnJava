package Recursion;
//this method is not bests method you can check my Recursive method for the more bests approaches .. Thaku !!
public class Hcf {
    public static void main(String[] args) {
        int a=12;
        int b=16;
        // by defult 1 is hcf of the all number
        for(int i=Math.min(a,b);i>=1;i--){
            //we start check from the  last of the min number ..
            if(a%i==0 && b%i==0){
               //And check the both are divied the same number or not
                System.out.println(i);
               break;
            }
        }


    }

}

