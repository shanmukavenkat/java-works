
class Human {
    //instance variables
    String name;
    int age;

    //instance methods
    void talk() {
        System.out.println(name + " is a man");
    }

    void walk() {
        System.out.println(name + " is playing");
    }
}
    class Objclass {
        public static void main(String[] args) {
            Human suresh = new Human();
            suresh.name = "srinivas";
            suresh.age = 15;
            suresh.talk();
            suresh.walk();

            Human harish=new Human();
            harish.name="hari";
            harish.age=48;
            harish.talk();
            harish.walk();

        }

    }

