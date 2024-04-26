package Q2Inheritance;

public class Car extends Vehicle {

    public void driven(){
        System.out.println("Repairing a car");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.driven();
    }
}
