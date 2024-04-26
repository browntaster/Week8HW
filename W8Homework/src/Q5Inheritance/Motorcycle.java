package Q5Inheritance;

public class Motorcycle extends Vehicle {

    public void CarDetails () {
        System.out.println("The Vehicle Details Are: HArley-Davidson, Sportster, 2024, Gasoline ");
    }

    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.CarDetails();
    }
}
