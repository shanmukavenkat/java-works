package Polymorphism;

public class Construct {
    Construct() {
        System.out.println("zero parameter constructor");
    }
    Construct(String name){
        System.out.println("string parameter constructor :"+name);
    }
    public static void main(String[] args){
        Construct c=new Construct();
        Construct c1=new Construct ("komal");

    }


}
