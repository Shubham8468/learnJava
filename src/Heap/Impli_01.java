package Heap;

import java.util.Arrays;

public class Impli_01 {
    public static class Students implements Comparable<Students>{
        String name;
        int rol;
        double cgpa;
        Students(String name, int rol, double cgpa){
            this.name=name;
            this.rol=rol;
            this.cgpa=cgpa;
        }
  public int compareTo (Students s){
            return (int)(this.cgpa-s.cgpa);
  }
    }
    public static void main(String[] args) {
        Students s1=new Students("shubham",114,7.1);
        Students s2=new Students("pooja",118,9.2);
        Students s3= new Students("Priya",120,8.3);
        Students s4= new Students("Rahul",122,5.3);
        Students s5= new Students("Satyam",129,6.3);
       Students[] arr={s1,s2,s3,s4,s5};

//       int[] arr2= {34,67,89,12};
        Arrays.sort(arr);
        for(Students ele : arr){
            System.out.println(ele.name +" and its rollNamber is "+ele.rol +" cgpa " +ele.cgpa);
        }

    }
}
