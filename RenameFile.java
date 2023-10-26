import java.io.File;
import java.io.IOException;

public class RenameFile {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\Ritik\\Desktop\\Ritik.txt");
        File r=new File("C:\\Users\\Ritik\\Desktop\\Yadav.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));}
        else System.out.println("File doesn't exist");
    }
}
