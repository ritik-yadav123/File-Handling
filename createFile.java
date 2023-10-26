import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\Ritik\\Desktop\\Ritik.txt");
        if(f.createNewFile())   System.out.println("File successfully created");
        else    System.out.println("File already exist");
    }
}
