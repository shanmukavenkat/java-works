package Abstractclass;


abstract class Abst {           //abstract class
    abstract void sound( );   //abstract method
    void man( ){                //concrete method
        System.out.println("i am from abst class");

    }

}
class Abst1 extends Abst{     //inheritance
    //in the parent class how many methods are there that
    //all methods are inherited to child class
    void sound(){                  //method over ridding
        System.out.println("Talking");
    }
    public static void main(String[] args){
        Abst ob=new Abst1();//referrence variable must be created
        ob.sound();
        ob.man();
    }

}