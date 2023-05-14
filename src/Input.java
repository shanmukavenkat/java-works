import java.io.*;

public class Input {
    public static void main(String[] args) throws Exception
    {
      System.out .println("snvskomal");
      System.out .print("komal");
      System.out.println("hi");
      System.out.println("komal");
      System.err.println("new");
      //we have connected input stream reader with keyboard
      InputStreamReader i= new InputStreamReader(System.in);
      //to get the input stream reader data we use the buffer stream reader
        BufferedReader j= new BufferedReader(i);
        char c = (char) j.read();
        System.out.println("you entered"+c);




    }
}
