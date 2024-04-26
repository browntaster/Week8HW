package Q7Polymorphism;

public class Bicycle extends Vehicle{
    public void Bicycle() {
        System.out.println("The Speed Of Bicycle is 25km/h");
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.Bicycle();
    }
}
