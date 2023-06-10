package methods;

public class Block {
    static
    {
        System.out.println("static block");
    }
    {
        System.out.println("non-static block");
    }
    public Block()
    {
        System.out.println("constructor");
    }
    public static void main(String[] args)
    {
        System.out.println("main method");
    }
//main method is  entry point of a program
    // but static block is executed first
    //static block is executed only once
}
