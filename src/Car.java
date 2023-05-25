import java.util.Scanner;

class CarModel {
    String name;
    int price;
    String color;

    void chooseColor(Scanner k) {
        System.out.println("Choose a color: ");
        color = k.nextLine();
    }
}

class Car {
    public static void main(String[] args) {
        CarModel sc = new CarModel();
        Scanner k = new Scanner(System.in);
        sc.chooseColor(k);
        System.out.println("Selected color: " + sc.color);
    }
}
