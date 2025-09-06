package BackTracking;
//this


public class basic {
    private static int maz(int sc,int sr,int ec,int er){
        if(sc>ec || sr>er){
            return 0;
        }
        if(sc==ec && sr==er){
            return 1;
        }
       int down= maz(sc+1,sr,ec,er);
        int right=maz(sc,sr+1,ec,er);
        int cout=down+right;
        return cout;
    }
    private static void print(int sr, int sc, int ec, int er, String s){
        if(sr>er || sc>ec){
            return ;
        }
        if(sr==er && sc==ec){
            System.out.println(s);
        }
        print(sr,sc+1,ec,er,s+"R");
        print(sr+1,sc,er,ec,s+"D");
    }
    public static void main(String[] args) {
        int row=2;
        int colums=2;
        int count=maz(1,1,row,colums);
        print(1,1,row,colums,"");
        System.out.println(count);

    }
}
