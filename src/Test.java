public class Test {
    public Test(){

    }
    public static void main(String[] args){
        Test t= new Test();//here we created the object
        Test m=new Test();
        System.out.println(t.hashCode());
        System.out.println(m.hashCode());
    }
}
