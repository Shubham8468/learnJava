package BackTracking;
//Here only allow
//go only right or Down
//not allow to go left and up!
public class directionMazeDeadBlock1 {
    public static void main(String[] args) {
        int row=3;
        int colum=3;
        int[][] maze={{1,0,1},
                      {1,1,1},
                      {1,0,1}};
        print(0,0,row-1,colum-1,"",maze);
    }
    public static void print(int sr,int sc,int er,int ec, String s,int[][] maze){
        if(sr>er || sc>ec){
            return;
        }
        if(sr==ec && sc==ec){
            System.out.println(s);
        }
        if(maze[sr][sc]==0){
            return;
        }
        //for right
        print(sr+1,sc,er,ec,s+"D",maze);
        //go down
        print(sr,sc+1,er,ec,s+"R",maze);

    }
}
