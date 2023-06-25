package Final;
//here we are creating the final class
class Demof {
    void display(){
        System.out.println("parent class");
    }
}
class Demo2 extends Demof{
    public static void main(String[] args){
        Demo2 d=new Demo2();
        d.display();
        Demof p=new Demof();
        p.display();
    }

}
