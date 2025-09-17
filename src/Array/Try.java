package Array;

public class Try {
    public static void main(String[] args) {
        int[] arr={56,89,700,588,465,6879,245,68};
        int max=-1;
        for(int r:arr){
            max=Math.max(max,r);
        }
        System.out.println(max);
    }
}
