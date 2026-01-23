package Heap;

import java.util.*;

public class CoustomComprator02 {

    static class Students implements Comparable<Students>{
        String name;
        int rol;
        double cgpa;
        Students(String name, int rol,double cgpa){
            this.name=name;
            this.rol=rol;
            this.cgpa=cgpa;
        }
        public int compareTo(Students s) {
            return (int)(this.cgpa- s.cgpa);
        }
    }
    public static void main(String[] args) {
        Students s1=new Students("Shubham",114,7.1);
        Students s2=new Students("Raghav",113,8.9);
        Students s3=new Students("Ravi",115,9.7);
        Students[] arr={s1,s2,s3};
        for(Students ele: arr){
            System.out.println(ele.name +" " +ele.rol +" " +ele.cgpa);
        }
        Arrays.sort(arr);

    }
}
