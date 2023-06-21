package methods;

import java.util.Scanner;

public class Methodsjava
{
    public static int addition(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for a:");
        int a= sc.nextInt();
        System.out.println("enter the value for b:");
        int b= sc.nextInt();
        System.out.println(addition(a,b));
    }
}
