public class maze_path4D {
        public static void main(String[] args){
            int rows = 3;
            int cols = 3;
            boolean[][] isvisited = new boolean[rows][cols]; // By default -> it is false
            print(0,0,rows-1,cols-1,"",isvisited);
        }
    
        private static void print(int sr,int sc,int er,int ec,String str,boolean[][] isvisited){

            if(sr<0 || sc<0) return;
            if(sr>er || sc>ec) return;
            if(isvisited[sr][sc] == true) return; // Very Importent
            if(sr==er && sc==ec){
                System.err.println(str);
                return;
            }
            isvisited[sr][sc] = true;
            // Go Right
            print(sr,sc+1,er,ec,str+"D",isvisited);
            // Go Down
            print(sr+1,sc,er,ec,str+"R",isvisited);
            // Go left
            print(sr,sc-1,er,ec,str+"L",isvisited);
            // Go up
            print(sr-1,sc,er,ec,str+"U",isvisited);
            isvisited[sr][sc] = false;
        }
        
    }
    
    

