package Heap;
import java.util.*;
public class customCompraitor {
     static  class  Students implements  Comparable<Students>{
        String name;
        int rln;
       double cgpa;
         Students(String name, int rln,double cgpa){
            this.name=name;
            this.rln=rln;
            this.cgpa=cgpa;
        }
        public  int compareTo(Students s){
             return Integer.compare(this.rln,s.rln);
        }
    }
    public static void main(String[] args) {
        Students s1=new Students("shubham",114,7.1);
        Students s2= new Students("poojs",21,8.5);
        Students s3=new Students("priya",11,8.3);
        Students s4=new Students("siva",113,5.5);
        Students s5= new Students("raghav",115,9.7);
        // Store in arr
        Students[] arr={s1,s2,s3,s4,s5};
        Arrays.sort(arr);// its give err// until i implement the Comparable<Students> this
        for(Students ele : arr) {
            System.out.println(ele.name + " " + ele.rln + " " + ele.cgpa);


        }
    }
}
