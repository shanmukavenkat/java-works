package File;
import java.io.*;
 public class Bufre1 {
        public static void main(String[] ar)throws Exception{
            FileReader fr=new FileReader("D:\\Demo2.txt");

            BufferedReader br=new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null)
                System.out.println(s);





        }
    }


