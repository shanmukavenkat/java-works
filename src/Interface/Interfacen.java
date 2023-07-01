package Interface;

public interface Interfacen {
    static final String x="hello";
    public abstract void k1();
    //in the interface we can implement the static methods
    static void k5(){
        System.out.println("here the static method is used");
    }
    //to get the print the static value we use the
    //classname.staticvariable
}
interface Interfacen2 {
    public static final String y="S.N.V.S";
    default void k3(){
        System.out.println("here Default keyword used");
    }
    //if we over-ridden the method the
    //default keyword is not needed
    //it uses the written statement and print it
    //if we not over-ridden the method
    //it uses the default statement and print it
}
interface Interfacen1  extends Interfacen2,Interfacen {
    public static final String z="KOMAL";
    public abstract void k2();
}



//To implement the interface to another interface
//we use the interface2 extends interface1
//to implement one interface or more than one interface in class we use
//class classname implement interface1,interface2


class InterfaceDemo implements Interfacen,Interfacen1{
    public void k1(){
        System.out.println("k1 method is overridden");
    }
    public void k2(){
        System.out.println("k2 method is overridden");
    }
    ///public void k3(){
      ///  System.out.println("k3 method is overridden");
    ///}
    public static void main(String[] args){
        InterfaceDemo d=new InterfaceDemo();
        d.k1();
        Interfacen.k5();
        System.out.println(x);
        d.k2();
        System.out.println(y);
        d.k3();
        System.out.println(z);

    }
//if the method name is same in the interfaces
//we can implement the interface to another one and we can
//override the method in the class
//and the same output is printed
//why because we are using only the method signature
//not using the definition of the method

}
