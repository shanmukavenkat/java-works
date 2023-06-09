package methods;

import java.util.Random;

public class Test1
{
    static int num;
    public static void main (String[] args)
    {
      Test1.num=new Random().nextInt();
      System.out.println("number created  "+Test1.num);
    }

    public static void print()

    {
        System.out.println("static-method");

    }
    public void print2()
    {
    System.out.println("non-static");
    }
}

