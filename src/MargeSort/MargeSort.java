package MargeSort;

public class MargeSort {
    public static void print(int[] arr){
        for(int temo: arr){
            System.out.print(temo+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1){
            //ye to pehle se hi sort hai;
            return ;
        }
        //Step 2: create 2 new empty arrays of size n/2;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];//jb array odd hoga to .isliye ye hai;
        int idx=0;
        //dono array me element inset krna hai ;
        for(int i=0;i<a.length;i++){
            a[i]=arr[idx];
            idx++;
        }
        for(int i=0;i<b.length;i++){
            b[i]=arr[idx];
            idx++;
        }
        //Stap 3 :Magic
        mergeSort(a);
        mergeSort(b);
        //Step 4 :merge 'a' and 'b' into arr;
        marge2arr(a,b,arr);
    }
   public static void marge2arr(int[] a,int[] b,int[] ans){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) {
                ans[k] = a[i];
                i++;
            }
            else{
                ans[k]=b[j];
                j++;
            }
            k++;
        }
        while (i<a.length){
            ans[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            ans[k]=b[j];
            j++;
            k++;
        }
   }
    public static void main(String[] args) {
        int[] arr={5,2,8,4,1,6,7,3};
        print(arr);
        mergeSort(arr);
        print(arr);
    }
}
