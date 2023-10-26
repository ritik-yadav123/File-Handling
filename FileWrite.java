import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
      try {
          FileWriter f = new FileWriter("C:\\Users\\Ritik\\Desktop\\Ritik.txt");
          try{
              f.write("Java is best language");}
          finally {
              f.close();
          }
          System.out.println("Successfuly wrote in file");
      }
      catch (IOException i){
          System.out.println(i);
      }

    }
    }

