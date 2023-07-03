package File;
import java.io.*;

public class Files {
    public static void main(String[] args){
        try{
            //to create a fil we use the try block
             File myobj=new File("d:\\Demo.txt");
             if (myobj.createNewFile()){
                 System.out.println("File is created");
             }else{
                 System.out.println("File already exists");
             }
        }catch(Exception e){
               System.out.println("An error occured");
               e.printStackTrace();
        }

    }

}
