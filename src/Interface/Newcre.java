package Interface;

public interface Newcre {
    void name();
    int k=10;
}
class New2 implements Newcre{
    public void name(){
        System.out.println("snvskomal");
    }
    public static void main (String[] args){
        New2 d=new New2();
        d.name();
        System.out.println(d.k);
    }
}