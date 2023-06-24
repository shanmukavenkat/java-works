package Polymorphism.Overriding;

//over-riding in instance method only

public class Over {
    void msg(){
        System.out.println("Parent method");
    }
}
class Demo extends Over{
    void msg(){
        System.out.println("Child method");
    }
    public static void main(String[] args){
        Over o=new Over();
        o.msg();
        Demo d=new Demo();
        d.msg();
        Over v=new Demo();
        v.msg();
    }
}
