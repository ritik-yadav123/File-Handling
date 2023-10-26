import java.io.FileReader;
import java.io.IOException;
//import java.lang.String;//do not need to import
//import java.io.File;
public class FileRead {
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("C:\\Users\\Ritik\\Desktop\\RC.txt");
            try{
                int i;
                while((i=f.read())!=-1){
                    System.out.print((char) i);
                }
                System.out.println();
            }
            finally {
                f.close();
                System.out.println("File Closed");
            }
        }
        catch (IOException i){
            System.out.println("Exception handled");
        }
    }
}
