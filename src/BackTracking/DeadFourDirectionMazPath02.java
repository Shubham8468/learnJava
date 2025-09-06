package BackTracking;
//here allowed four direction in maze
//like you can move right,left,Down ,Updown
// use backtracking
public class DeadFourDirectionMazPath02 {
    public static void main(String[] args) {
        int row=4;
        int colum=4;
        boolean[][] isvalied=new boolean[row][colum];
        int[][] maze={{1,0,1,1},
                      {1,1,1,1},
                      {0,0,1,1},
                      {1,1,1,0}};
        print(0,0,row-1,colum-1,"",maze,isvalied);
    }
    public static void print(int sr,int sc,int er,int ec,String s,int[][] maze,boolean[][] isvalied){
        if(sr<0 || sc<0){
            return;
        }
        if(sr>er ||sc>ec){
            return;
        }
        if(sr==er && sc==ec){
            System.out.println(s);
        }
        if(maze[sr][sc]==0){
            return;
        }
        if(isvalied[sr][sc]==true){
            return;
        }
        //
        isvalied[sr][sc]=true;
        //go right
        print(sr+1,sc,er,ec,s+"D",maze,isvalied);
        //go Down
        print(sr,sc+1,er,ec,s+"R",maze,isvalied);
        //go left
        print(sr,sc-1,er,ec,s+"L",maze,isvalied);
        //go up
        print(sr-1,sc,er,ec,s+"U",maze,isvalied);
        maze[sr][sc]=1;
        isvalied[sr][sc]=false;
    }
}
