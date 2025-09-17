package MargeSort;

public class marge2ShortedArrays {
    public static int[] add(int[] arr1, int[]arr2,int[] ans){
        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
            }
            k++;
        }
        if(j+1!=arr2.length){
            while(j<arr2.length){
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(i+1!=arr1.length){
            while (i<arr1.length){
                ans[k]=arr1[i];
                i++;
                k++;
            }
        }
        return ans;
    }
    public static void print(int[] arr){
        for(int temp: arr){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1={10,20,60,80,90,120};
        int[] arr2={30,40,50,70,100,110,130,140};
        int[] ans=new int[14];
        add(arr1,arr2,ans);
        print(ans);
    }
}
