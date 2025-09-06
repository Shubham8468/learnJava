package BackTracking;

public class PrintPathMaze {
    public static void main(String[] args) {
        int row=3;
        int colum=3;
        print(1,1,row,colum,"");
        System.out.println();
        System.out.println("Total possible maze is :"+maze(1,1,row,colum));

    }
    public static void print(int sr,int sc,int er,int ec,String s){
        if(sr>er || sc>ec){
            return ;
        }
        if(sr==er&&sc==ec){
            System.out.println(s);
        }
        print(sr+1,sc,er,ec,s+"D");//go Down
        print(sr,sc+1,er,ec,s+"R");//go right
    }
    public static int maze(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec){
            return 0;
        }
        if(sr==er || sc==er){
            return 1;
        }
        int rightCount= maze(sr,sc+1,er,ec);
        int downCount=maze(sr+1,sc,er,ec);
        return rightCount+downCount;
    }


}
