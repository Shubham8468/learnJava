package Sorting.BubbleSort;

public class Find2SumPair {
    public static void print(int[] arr){
        for(int item: arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }
    public static int[] sort(int[] arr){
        //apply bubble sort
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int swap=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }

            }
            if(swap==0){
                break;
            }

        }
       return arr;
    }
    public static void sumFindNum(int[] arr,int tar){
        int lo=0;
        int n=arr.length;
       int  hi=n-1;
       while(lo<=hi){
         if(arr[lo]+arr[hi]==tar){
             System.out.println("Number is "+arr[lo]+" And "+arr[hi]);
             return ;
         }
         else if(arr[lo]+arr[hi]>tar){
             hi--;
         }
         else{
             lo++;
         }
       }
        System.out.println("Nubmer is not founded!!");

    }
    public static void main(String[] args) {
        int[] arr={7,0,4,3,2,8,10};
        print(arr);
        sort(arr);
        System.out.println();
        print(arr);
        sumFindNum(arr,100);


    }

}
