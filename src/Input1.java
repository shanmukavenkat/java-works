import java.util.*;

public class Input1 {
    public static void main(String[] args){
        //here we are using the scanner new class
        //so we can say that we can directly connect
        //the keyboard with out any using any
        //buffer stream and any other stream
        Scanner s =new Scanner(System.in);
        System.out.println("1st input");
        int first = s.nextInt();
        System.out.println("2nd input");
        int second=s.nextInt();
        int result= first+second;
        System.out.println("result is:"+result);


    }
}
