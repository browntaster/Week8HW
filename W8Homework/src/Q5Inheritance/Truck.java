package Q5Inheritance;

public class Truck extends Vehicle {
    public void CarDetails() {
        System.out.println("The Vehicle Details Are: Ford F-120, 2023, Gasoline");
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.CarDetails();
    }
}
