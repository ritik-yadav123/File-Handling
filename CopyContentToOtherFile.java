import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContentToOtherFile {
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("C:\\Users\\Ritik\\Desktop\\Ritik.txt");
        FileOutputStream r=new FileOutputStream("C:\\Users\\Ritik\\Desktop\\Yadav.txt");
        int i;
        while ((i=f.read())!=-1){
            r.write((char) i);
        }
        System.out.println("Data copied Successfully");
    }
}
