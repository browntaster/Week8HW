package Q5Inheritance;

public class Car extends Vehicle {
    public void CarDetails() {
        System.out.println("The Vehicle Details Are: Hyundai Tucson, 2023, Gasoline");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.CarDetails();
    }

}
