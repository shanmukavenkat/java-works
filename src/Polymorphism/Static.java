package Polymorphism;

public class Static {
    //here we are applying the polymorphism in static methods
    static void show(int x){
        System.out.println("welcome to static int parameter: "+x);

    }
    static void show(double x, int a){
        System.out.println("welcome to static double parameter:"+(x+a));

    }
    public static void main(String[] args){
        show(10);
        show(10.5,8);
    }

}
