package Interface;

interface MYinterface {//interface is created
    public static final int x=15;//by default it is public static final---> there are final
    public abstract void m2(); //abstract method

}
class Interface implements MYinterface{
   public void m2(){//must needed  public keyword
        System.out.println("m2 method overridden");
    }
    public static void main(String[] args){
       Interface c=new Interface(); //only child class can   create the object
        c.m2();
        System.out.println(c.x);
    }
}
