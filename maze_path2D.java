public class maze_path2D {
    public static void main(String[] args){
        int rows = 3;
        int cols = 3;
        print(1,1,rows,cols,"");
    }

    private static void print(int sr,int sc,int er,int ec,String str){
        if(sr<1 || sc<1) return;
        if(sr==er && sc==ec){
            System.err.println(str);
            return;
        }
        // Go down
        print(sr+1,sc,er,ec,str+"R");
        // Go right
        print(sr,sc+1,er,ec,str+"D");
       
    }
    
}
