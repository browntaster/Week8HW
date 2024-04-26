package Q7Polymorphism;

public class Car extends Vehicle{

    public void Car() {
        System.out.println("The Speed Of Bicycle is 25km/h");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.Car();
    }

}
