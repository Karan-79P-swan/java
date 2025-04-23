import java.io.File;
import java.io.IOException;
public class ReadFile{
    public static void main(String[] args) {
        try{
            File myfile = new File("file3.txt");
            
            if(myfile.createNewFile()){
                System.out.println("File Created : "+ myfile.getName());
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("An erroe occured");
            e.printStackTrace();

        }
    }
}