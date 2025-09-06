package BackTracking;

public class MazePath {
    public static int maz(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec){
            return 0;
        }
        if(sr==er && sc==ec){
            return 1;
        }

        int downways=maz(sr+1,sc,er,ec);
        int rightwayas=maz(sr,sc+1,er,ec);
        int totalways=downways+rightwayas;
        return totalways;
    }
    public static void main(String[] args) {
        int row=3;
        int colum=3;
        int count=maz(1,1,row,colum);
        System.out.println(count+" ways");
    }
}
