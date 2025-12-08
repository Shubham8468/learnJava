package MargeSort;

public class Try {
    public static void print(int[] arr){
        for(int temp: arr){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    public static int[] mergeArr(int[] a,int[] b,int[] arr){
        int i=0,j=0,inx=0;
       while(i<a.length&& j<b.length){
           if(a[i]<b[j]){
               arr[inx]=a[i];

               i++;
           }
           else{
               arr[inx]=b[j];
               j++;
           }
           inx++;
       }
       while(i<a.length){
           arr[inx]=a[i];
           inx++;
           i++;
       }
       while(j<b.length){
           arr[inx]=b[j];
           inx++;
           j++;
       }
      return  arr;
    }
    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1){
            return ;
        }
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        //insert item in new arr;
        int idx=0;
        for(int i=0;i<a.length;i++){
            a[i]=arr[idx];
            i++;
            idx++;
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=arr[idx];
            i++;
            idx++;

        }
        //magic
        mergeSort(a);
        mergeSort(b);
        //after this we add this
        mergeArr(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr={23,56,68,23,54,53,21,43,778,99998,676};
        print(arr);
        mergeSort(arr);
        print(arr);
    }
}
