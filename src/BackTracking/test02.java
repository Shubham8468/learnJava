package BackTracking;
import java.util.*;
public class test02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("-: FourDirection Maze Path :-");
        System.out.println("Print all possible path ");
        System.out.print("Enter maze Row :");
        int row=sc.nextInt();
        System.out.print("Enter Maze colum :");
        int colum=sc.nextInt();
        boolean[][] isvisited=new boolean[row][colum];//its only use for the story all visitad path so that if rat not
        //visite same path or index;
        print(0,0,row-1,colum-1,"",isvisited);

    }
    public static void print(int sr,int sc,int er,int ec,String s,boolean[][] isvisited){
        if(sr>er || sc>ec){
            return;
        }
        if(sr<0 || sc<0){
            return;
        }
        if(isvisited[sr][sc]==true){
            return;//here we check the rat are visite the same index privious or not
        }
        if(sr==er && sc==ec){
            System.out.println(s);
        }
        isvisited[sr][sc]=true;//file ture when visite the path
        // right move
        print(sr,sc+1,er,ec,s+"R",isvisited);
        //Down move
        print(sr+1,sc,er,ec,s+"D",isvisited);
        //go up
        print(sr-1,sc,er,ec,s+"U",isvisited);
        //go left
        print(sr,sc-1,er,ec,s+"L",isvisited);
        isvisited[sr][sc]=false;//and its is the importen ,for the find diffrent possiblties

    }
}
