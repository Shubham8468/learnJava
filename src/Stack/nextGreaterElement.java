package Stack;
//Approach ..
//pop,ans,push
//This method are not sufficient becouse its..
//Its Time complexity is o(n2)
public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        int[] res=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            res[i]=-1;//by Defult set as -1 if any number in arr not counten the next greater elemnt in
            //The array ;And we know that the element in the array they have not any greater element
            //So that as for the rule of the array we assing -1;
            for(int j=i+1;j<arr.length;j++){
                //here check the next element is greater for the priveous of not
                if(arr[j]>arr[i]){
                    res[i]=arr[j];
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");

        }
    }
}
