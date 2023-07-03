package File;
import java.io.*;

public class Files {
    public static void main(String[] args){
        try{
            //to create a file we use the try and catch block
            //here we have used the -->createNewFile() method
            //and we mentioned the path of the file
            // File myobj=new File("d:\\KOMAL\\Demo.txt"); to create in directory

            File myobj=new File("d:\\KOMAL\\Demo.txt");
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
