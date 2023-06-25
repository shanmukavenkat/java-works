package Final;
//here we are using the final keyword with the method
//we cannot override the final method

public class MethodF {
    final void display(){
        int x=10;
        System.out.println("parent "+x);
    }
}
class Method2 extends MethodF{
    public static void main(String[] args){
        Method2 d= new Method2();
        d.display();
    }

        void display(){
        int y=20;
            System.out.println("child "+y);
        }

}
