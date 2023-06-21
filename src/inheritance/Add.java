package inheritance;
//it is multilevel inheritance
public class Add {
    int a=10,b=2;
    void add(){
        System.out.println("addition is "+(a+b));

    }
}
class Sub extends Add{
    void sub(){
        System.out.println("subtraction is "+(a-b));
    }
}
class Multi extends Sub{
    void mul(){
        System.out.println("multiplication is "+ (a*b));
    }
}
class Div extends Multi{
    void div(){
        System.out.println("division is "+ (a/b));
    }
}
class Inheritance{
    public static void main(String[] args){
        Div d=new Div();
        d.add();
        d.sub();
        d.mul();
        d.div();
    }
}