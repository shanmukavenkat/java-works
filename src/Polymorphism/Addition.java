package Polymorphism;
//here we are creating the polymorphism
//here we are creating the method overloading
//in this there are three signatures they are
//--<1>--number of parameters
//--<2>--type of parameters
//--<3>--order of parameters

public class Addition {
  void add(int a,int b){
      System.out.println("Additon result is :"+(a+b));
  }
  //here method overloading applied
    //here the complier decide what method to call based on parameters
  void add(int c,int d,int e){
        System.out.println("Addition result is :"+(c+d*e));
    }
    public static void main(String[] args){
        Addition a=new Addition();
        a.add(1,5,6);
        a.add(2,78);




    }
}
