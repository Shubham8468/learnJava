package BackTracking;
//here we no use extra space
//
public class withExtraSpaceDeadFourDirectionMazPath02_1 {
    public static void main(String[] args) {
        int row=3;
        int colum=4;
        int[][] maze={{1,0,1,1},
                      {1,1,1,1},
                      {0,0,1,1}};
        printPath(0,0,row-1,colum-1,"",maze);
    }
    public static void printPath(int sr,int sc,int er,int ec,String s,int[][] maze){
        if(sr>er || sc>ec){
            return;
        }
        if(sr<0 || sc<0){
            return;
        }
        if(sr==er && sc==ec){
            System.out.println(s);
        }
        if(maze[sr][sc]==0){//Block
            return;
        }
        if(maze[sr][sc]==-1){//this was already visite
            return;
        }
        maze[sr][sc]=-1;//mark
        // go right
        printPath(sr+1,sc,er,ec,s+"R",maze);
        // go Down
        printPath(sr,sc+1,er,ec,s+"D",maze);
        // go left
        printPath(sr,sc-1,er,ec,s+"L",maze);
        //go up
        printPath(sr-1,sc,er,ec,s+"D",maze);
        //backtracking
        maze[sr][sc]=1;

    }
}
