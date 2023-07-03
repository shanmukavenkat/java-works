package File;
import java.io.*;

public class Filetasks{
    public static void main(String[] args){
             File Myobj1=new File("d:\\Demo.txt");
             if(Myobj1.exists()) {
                 System.out.println("File name:" + Myobj1.getName());
                 System.out.println("absolute path:" + Myobj1.getAbsolutePath());
                 System.out.println("Write able:" + Myobj1.canRead());
                 System.out.println("Readable:" + Myobj1.canRead());
                 System.out.println("File Size:" + Myobj1.length());
             }else{
                 System.out.println("the fila doesn't exist");
         }
    }
}
