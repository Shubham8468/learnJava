package Array;

public class MaxNuminArr {
    public static int maxmun(int[] arr){
        if(arr==null)return 0;
        int max=-1;
        for(int i=0;i<=arr.length-1;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        return max;
    }
    public static int secoudMax(int[] arr){
        if(arr==null) return 0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
            if(smax<arr[j]&&arr[j]!=max){
                smax=arr[j];
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        int[] arr={56,89,700,588,465,6879,245,68};
        System.out.println( maxmun(arr));
       System.out.println(secoudMax(arr));
    }
}
