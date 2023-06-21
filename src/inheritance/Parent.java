package inheritance;

public class Parent {
    int salary=100000;

}
class Child extends Parent{
    int money=100000;
    public static void main(String[] args){
        Child c=new Child();
        System.out.println("salary is "+(c.money+c.salary));
    }
}