package Stack;
import java.util.*;

public class balanceBreckets {
    public static boolean isBalance(String str){
        Stack<Character> st=new Stack<>();
        int ln=str.length();
        for(int i=0;i<ln;i++){
           char ch=str.charAt(i);
           if(ch=='('){
               st.push(ch);
           }
           else{// ch==')'
               if(st.size()==0){
                   return false;
               }
               if(st.peek()=='('){
                   st.pop();
               }
           }
        }
        if(st.size()>0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Breckets :");
        String str=sc.nextLine();
        System.out.println(isBalance(str));
    }
}
